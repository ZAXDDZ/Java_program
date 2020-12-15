package com.company;

import java.util.Scanner;

public class FIND_SMALLEST_IN_MATRIX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row, column;
        row = input.nextInt();
        column = input.nextInt();
        double[][] matrix = new double[row][column];
        for(int r = 0; r < row; ++r){
            for(int c = 0; c < column; ++c){
                matrix[r][c] = input.nextDouble();
            }
        }

        int[] point;
        point = locateSmallest(matrix);
        System.out.println("The location of the smallest element is at (" + point[0] + ", " + point[1] + ")");
    }

    public static int[] locateSmallest(double[][] a){
        int[] tempPoint = new int[2];
        double min = a[0][0];
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[i].length; ++j){
                if(a[i][j] < min){
                    tempPoint[0] = i;
                    tempPoint[1] = j;
                    min = a[i][j];
                }
            }
        }
        return tempPoint;
    }
}