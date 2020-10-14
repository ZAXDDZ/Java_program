package com.company;

import java.util.Scanner;
import java.lang.Math;

public class POINT_IN_CIRCLE {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y, distan;

        x = scan.nextDouble();
        y = scan.nextDouble();

        distan = Math.sqrt(x * x + y * y);

        if(distan <= 10.0){
            System.out.printf("(%.1f,%.1f) is in the circle\n", x, y);
        }
        else{
            System.out.printf("(%.1f,%.1f) is not in the circle\n", x, y);
        }
    }
}