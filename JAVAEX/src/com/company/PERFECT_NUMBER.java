package com.company;

import java.util.Scanner;

public class PERFECT_NUMBER {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 1;
        while(number > 0 && number < 10000){
            int sum = 0;
            for(int i = 1; i < number; ++i){
                if(number % i == 0){
                    sum += i;
                }
            }
            if(number == sum){
                System.out.println(number);
            }
            ++number;
        }
    }
}