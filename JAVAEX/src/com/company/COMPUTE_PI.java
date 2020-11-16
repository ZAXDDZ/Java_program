package com.company;

import java.util.Scanner;

public class COMPUTE_PI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNextDouble()){
            double n;
            double pi = 0;
            n = input.nextDouble();
            if(n == 1){
                pi = 1;
            }
            else{
                for(int i = 1; i <= n; ++i){
                    pi += Math.pow( (-1), i+1) / (2*i-1);
                }
            }
            pi *= 4;
            System.out.println(pi);
        }
    }
}