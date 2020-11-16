package com.company;

import java.util.Scanner;

public class MATRIX_MUL {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int times;
        times = input.nextInt();
        while(times != 0){
            int A_row, A_col, B_row, B_col;
            A_row = input.nextInt();
            A_col = input.nextInt();
            int A[][] = new int[A_row][A_col];

            int row, column;
            for(row = 0; row < A_row; ++row){
                for(column = 0; column < A_col; ++column){
                    A[row][column] = input.nextInt();
                }
            }

            B_row = input.nextInt();
            B_col = input.nextInt();
            int B[][] = new int[B_row][B_col];
            for(row = 0; row < B_row; ++row){
                for(column = 0; column < B_col; ++column){
                    B[row][column] = input.nextInt();
                }
            }

            int result[][] = new int[A_row][B_col];
            int counter;
            for(row = 0; row < A_row; ++row){
                counter = 0;
                for(column = 0; column < B_col; ++column) {
                    result[row][column] = 0;
                    for (int same = 0; same < A_col; ++same){
                        result[row][column] += A[row][same] * B[same][column];
                    }
                    ++counter;
                    if(counter < B_col){
                        System.out.print(result[row][column] + " ");
                    }
                    else{
                        System.out.println(result[row][column]);
                    }

                }
            }

            --times;
            if(times != 0){
                System.out.println();
            }
        }
    }
}