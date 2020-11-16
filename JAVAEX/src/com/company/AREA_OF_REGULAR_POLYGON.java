package com.company;

import java.util.Scanner;

public class AREA_OF_REGULAR_POLYGON {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n, side, area;

        while(input.hasNextDouble()){
            n = input.nextDouble();
            side = input.nextDouble();
            area = ( n * Math.pow(side, 2) ) / ( 4 * Math.tan(Math.PI / n) );
            System.out.println(area);
        }
    }
}