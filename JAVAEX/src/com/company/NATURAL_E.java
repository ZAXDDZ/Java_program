package com.company;

import java.util.Scanner;

public class NATURAL_E {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        while(input.hasNextInt()){
            number = input.nextInt();

            double e = 1;
            double hier = 1;
            for(int i = 1; i <= number; ++i){
                hier *= i;
                e += 1 / hier;
            }
            System.out.println(e);
        }
    }
}