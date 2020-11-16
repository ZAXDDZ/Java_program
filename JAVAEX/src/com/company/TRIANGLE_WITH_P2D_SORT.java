package com.company;

import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Scanner;

public class TRIANGLE_WITH_P2D_SORT {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int times;
        times = input.nextInt();
        input.nextLine();
        while(times != 0){
            double x1, y1, x2, y2, x3, y3;
            x1 = input.nextDouble();
            y1 = input.nextDouble();
            x2 = input.nextDouble();
            y2 = input.nextDouble();
            x3 = input.nextDouble();
            y3 = input.nextDouble();
            Point(x1, y1, x2, y2, x3, y3);

            --times;
        }
    }

    public static void Point(double x1, double y1, double x2, double y2, double x3, double y3){
        Point2D p1 = new Point2D.Double(x1, y1);
        Point2D p2 = new Point2D.Double(x2, y2);
        Point2D p3 = new Point2D.Double(x3, y3);
        Triangle(p1, p2, p3);
    }

    public static void Triangle(Point2D p1, Point2D p2, Point2D p3){
        double a;
        double b;
        double c;
        a = p1.distance(p2);
        b = p2.distance(p3);
        c = p3.distance(p1);

        if(a + b > c && a + c > b && b + c > a){
            Double[] side = new Double[3];
            side[0] = a;
            side[1] = b;
            side[2] = c;
            Arrays.sort(side);
            double s, area;
            s = (a + b + c) / 2;
            area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
            System.out.printf("%.3f %.3f %.3f %.3f\n", side[0], side[1], side[2], area);
        }
        else{
            System.out.println("Just Line!");
        }

    }
}