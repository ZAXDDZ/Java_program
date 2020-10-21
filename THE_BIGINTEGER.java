package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class THE_BIGINTEGER {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BigInteger M;
        BigInteger N;
        BigInteger G;
        BigInteger L;

        while(input.hasNextBigInteger()){
            M = input.nextBigInteger();
            N = input.nextBigInteger();

            G = M.gcd(N);
            L = (M.multiply(N)).divide(G);
            System.out.println(G + " " + L);

            BigInteger nextB = L;
            int counter = 5;
            while(counter != 0){
                nextB = nextB.nextProbablePrime();
                if(counter > 1){
                    System.out.print(nextB + " ");
                }
                else{
                    System.out.println(nextB);
                }
                --counter;
            }
        }

    }
}