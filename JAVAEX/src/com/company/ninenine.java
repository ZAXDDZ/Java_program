package com.company;

public class ninenine {

    public static void main(String[] args) {

        int counter;

        for(int i = 1; i <= 9; ++i){
            counter = 0;
            for(int j = 1; j <= 9; ++j){
                ++counter;
                if(counter <= 8) {
                    System.out.printf("%d * %d = %2d ", i, j, i * j);
                }
                else{
                    System.out.printf("%d * %d = %2d", i, j, i*j);
                }
            }
            System.out.println();
        }

    }
}