package com.company;

import java.util.Scanner;

public class cramer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a, b, e, c, d, f;


        a = scan.nextDouble();
        b = scan.nextDouble();
        e = scan.nextDouble();
        c = scan.nextDouble();
        d = scan.nextDouble();
        f = scan.nextDouble();

        double x, y;

        x = (e * d - f * b) / (a * d - b * c);
        y = (a * f - c * e) / (a * d - b * c);

        System.out.println(x + " " + y);
    }
}