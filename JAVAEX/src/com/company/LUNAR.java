package com.company;

import java.util.Scanner;

public class LUNAR {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        while(input.hasNextInt()){
            year = input.nextInt();

            if(year == -1){
                break;
            }

            if(year % 4 == 0 && year % 100 != 0){
                System.out.println("It is leap year.");
            }
            else if(year % 400 == 0){
                System.out.println("It is leap year.");
            }
            else{
                System.out.println("It is not leap year.");
            }
        }

    }
}