package com.company;

import java.util.Scanner;
import java.lang.Math;

public class TWO_POINTS_DISTANCE {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1, y1, x2, y2, x, y, distan;

        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        x = (x2 - x1) * (x2 - x1);
        y = (y2 - y1) * (y2 - y1);
        distan = Math.pow( (x + y), 0.5);

        System.out.println(distan);
    }
}