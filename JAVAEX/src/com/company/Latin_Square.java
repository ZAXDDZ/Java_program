package com.company;

import java.util.Scanner;

public class Latin_Square {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        while (input.hasNextInt()) {
            int number;
            number = input.nextInt();
            if (number == -1) {
                break;
            }
            if(counter != 0){
                System.out.println();
            }


            if (0 < number && number <= 26) {
                String[][] square = new String[number][number];

                for (int i = 0; i < number; ++i) {
                    for (int j = 0; j < number; ++j) {
                        square[i][j] = input.next();
                    }
                }

                if (number == 1) {
                    System.out.println("The input array is a Latin square");
                }
                else {
                    String elestr = new String();
                    int element = 0;
                    for(int e = 0; e < number; ++e){
                        elestr += square[0][e];
                        element += elestr.charAt(e);
                    }

                    int row , column;
                    boolean bl1 = false;
                    String str = new String();
                    int count;
                    for (row = 1; row < number; ++row) {
                        bl1 = true;
                        count = 0;
                        for (column = 0; column < number; ++column) {
                            str += square[row][column];
                            count += str.charAt(column);
                            if(column == number - 1 && count != element){
                                bl1 = false;
                                break;
                            }
                        }
                        if(!bl1){
                            break;
                        }
                    }

                    boolean bl = false;
                    for (row = 0; row < number; ++row) {
                        bl = true;
                        for (column = 0; column < number; ++column) {
                            for (int n = column + 1; n < number; ++n) {
                                if (square[row][column].equals(square[row][n])) {
                                    bl = false;
                                    break;
                                }
                            }
                            for (int k = row + 1; k < number; ++k) {
                                if (square[row][column].equals(square[k][column])) {
                                    bl = false;
                                    break;
                                }
                            }
                            if (!bl) {
                                break;
                            }
                        }
                        if (!bl) {
                            break;
                        }
                    }

                    if (bl && bl1) {
                        System.out.println("The input array is a Latin square");
                    }
                    else {
                        System.out.println("The input array is not a Latin square");
                    }
                }
            }
            ++counter;
        }
    }
}