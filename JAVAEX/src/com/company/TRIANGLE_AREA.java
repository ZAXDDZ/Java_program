package com.company;

import java.util.Scanner;
import java.lang.Math;

public class TRIANGLE_AREA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1, y1, x2, y2, x3, y3, x, y, sidea, sideb, sidec, s,area;

        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        x3 = scan.nextDouble();
        y3 = scan.nextDouble();

        if( (x1 / x2) == (y1 / y2) || (x2 / x3) == (y2 / y3) || (x3 / x1) == (y3 / y1) ){
            System.out.println("Not Triangle");
        }
        else {
            x = (x2 - x1) * (x2 - x1);
            y = (y2 - y1) * (y2 - y1);
            sidec = Math.pow((x + y), 0.5);

            x = (x3 - x2) * (x3 - x2);
            y = (y3 - y2) * (y3 - y2);
            sidea = Math.pow((x + y), 0.5);

            x = (x1 - x3) * (x1 - x3);
            y = (y1 - y3) * (y1 - y3);
            sideb = Math.pow((x + y), 0.5);

            s = (sidea + sideb + sidec) / 2;
            area = Math.sqrt(s * (s - sidea) * (s - sideb) * (s - sidec));
            System.out.printf("%.3f\n", area);
        }
    }
}