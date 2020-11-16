package com.company;

import java.util.Scanner;
import java.util.Vector;

public class PERFECT_SQUARE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNextInt()){
            int number;
            number = input.nextInt();
            int origin = number;

            int counter = 0;
            int mul = 1;
            Vector list = new Vector();
            for(int i = 2; i <= number; ++i){
                counter = 0;
                while(number % i == 0){
                    list.add(i);
                    ++counter;
                    number /= i;
                }
                if(counter % 2 != 0){
                    mul *= i;
                }
            }
            System.out.println(mul + " " + origin * mul);
        }
    }
}