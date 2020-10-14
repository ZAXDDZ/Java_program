package com.company;

import java.util.Scanner;

public class A_NUMBER_MULTIPLE {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        num = scan.nextInt();

        int mult = 1;

        if(num >= 0 && num <= 1000){
            while(num >= 1){
                mult *= num % 10;
                num /= 10;
            }
        }

        System.out.println(mult);
    }
}