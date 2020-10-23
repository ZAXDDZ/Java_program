package com.company;

import java.util.*;

public class MAGIC_SQUARE {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N;  //number of square size

        while(input.hasNextInt()){
            N = input.nextInt();    //input a number
            if(N % 2 != 0){         //number is odd
                int square[][];     //set a square double array
                square = new int[N][N];

                for(int row = 0; row < N; ++row){
                    for(int colum = 0; colum < N; ++colum){
                        square[row][colum] = 0;
                    }
                }// all value in array turn to 0

                square[N-1][(N-1)/2] = 1;   //set 1 start from

                int rowCheck = N-1;         //check row from N-1
                int columCheck = (N-1)/2;   //check column from (N-1)/2
                for(int cout = 2; cout <= N*N; ++cout){                         //put number from 2 to N*N in array
                    if(square[(rowCheck+1)%N][(columCheck+1)%N] == 0){          //if the place is 0 then put in number
                        square[(rowCheck+1)%N][(columCheck+1)%N] = cout;
                        rowCheck = (rowCheck+1)%N;
                        columCheck = (columCheck+1)%N;
                    }
                    else{                                                       //if the place is not 0 then put number in down of origin
                        square[rowCheck-1][columCheck] = cout;
                        rowCheck = rowCheck-1;
                    }
                }

                int sum = 0;    //total of row or total of column or total of diagonal
                for(int firstcol = 0; firstcol < N; ++firstcol){
                    sum += square[0][firstcol];
                }   //total of first row
                System.out.println(sum);    //print sum

                for(int rowpt = 0; rowpt < N; ++rowpt){
                    for(int columpt = 0; columpt < N; ++columpt){
                        System.out.printf("%5d", square[rowpt][columpt]);
                    }
                    System.out.println();
                }
                System.out.println();   //print magic square

            }

            else{   //number is even
                System.out.println("It is not an odd number.");
                if(input.hasNextInt()){
                    System.out.println();
                }
            }
        }
    }
}