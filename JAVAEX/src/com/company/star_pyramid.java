package com.company;

import java.util.Scanner;

public class star_pyramid {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();


        for(int i = 1; i <= N; ++i) {
        for (int j = N; j > i; --j) {
        System.out.print(" ");
        }
        for(int k = 0; k < i*2-1; ++k){
        System.out.print("*");
        }
        System.out.println();
        }

    }
}