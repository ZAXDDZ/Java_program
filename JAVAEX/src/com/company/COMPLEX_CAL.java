package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class COMPLEX_CAL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, d;
        while(input.hasNextDouble()){
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();
            d = input.nextDouble();

            Complex cp1 = new Complex(a,b);
            Complex cp2 = new Complex(c,d);
            Complex pair = new Complex();
            pair.add(cp1, cp2);
            System.out.println("(" + cp1.toString() + ")" + " + " + "(" + cp2.toString() + ")" + " = " + pair.toString());
            pair.sub(cp1, cp2);
            System.out.println("(" + cp1.toString() + ")" + " - " + "(" + cp2.toString() + ")" + " = " + pair.toString());
            pair.mul(cp1, cp2);
            System.out.println("(" + cp1.toString() + ")" + " * " + "(" + cp2.toString() + ")" + " = " + pair.toString());
            pair.div(cp1, cp2);
            System.out.println("(" + cp1.toString() + ")" + " / " + "(" + cp2.toString() + ")" + " = " + pair.toString());
            System.out.printf("|%s| = %.4f\n", cp1.toString(), pair.abs(cp1));
            System.out.println();
        }
    }
}

class Complex implements Cloneable{
    private double x;
    private double y;

    Complex(){
    }
    Complex(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return new BigDecimal(x).setScale(4, RoundingMode.UP) + " + " + new BigDecimal(y).setScale(4, RoundingMode.UP) + "i";
    }

    public void add(Complex s1, Complex s2){
        x = s1.x + s2.x;
        y = s1.y + s2.y;
    }

    public void sub(Complex s1, Complex s2){
        x = s1.x - s2.x;
        y = s1.y - s2.y;
    }

    public void mul(Complex s1, Complex s2){
        x = s1.x * s2.x - s1.y * s2.y;
        y = s1.y * s2.x + s1.x * s2.y;
    }

    public void div(Complex s1, Complex s2){
        x = (s1.x * s2.x + s1.y * s2.y) / (Math.pow(s2.x, 2) + Math.pow(s2.y, 2));
        y = (s1.y * s2.x - s1.x * s2.y) / (Math.pow(s2.x, 2) + Math.pow(s2.y, 2));
    }

    public double abs(Complex s){
        double number;
        number = Math.sqrt(Math.pow(s.x, 2) + Math.pow(s.y, 2));
        return number;
    }
}