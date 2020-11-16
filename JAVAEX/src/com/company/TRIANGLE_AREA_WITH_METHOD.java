package com.company;

import java.util.Scanner;

public class TRIANGLE_AREA_WITH_METHOD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double s1, s2, s3;
        s1 = input.nextDouble();
        s2 = input.nextDouble();
        s3 = input.nextDouble();

        boolean bl;
        bl = isValid(s1, s2, s3);

        if(bl){
            System.out.printf("The are of the triangle is %.1f\n", area(s1,s2,s3));
        }
        else{
            System.out.println("Input is invalid");
        }
    }

    public static boolean isValid(double side1, double side2, double side3){
        boolean bl_val = true;
        if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
        }
        else{
            bl_val = false;
        }
        return bl_val;
    }

    public static double area(double side1, double side2, double side3){
        double a, s;
        s = (side1 + side2 + side3)/2;
        a = Math.sqrt( s*(s-side1)*(s-side2)*(s-side3) );
        return a;
    }
}