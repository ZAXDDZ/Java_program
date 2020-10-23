package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Palindromic_Prime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter;
        while(input.hasNextInt()){
            counter = input.nextInt();
            if(counter == 0){
                System.out.println();
                continue;
            }

            if(counter > 0 && counter <= 100){
                BigInteger number = BigInteger.ONE;
                int changeline = 1;

                while(counter != 0){
                    number = number.nextProbablePrime();
                    if(number.compareTo(BigInteger.TEN) < 0){
                        if(changeline % 10 == 0 || counter == 1){
                            System.out.println(number);
                        }
                        else{
                            System.out.print(number + " ");
                        }
                        --counter;
                        ++changeline;
                    }
                    else{
                        String strnumber1 = number.toString();
                        StringBuilder strnumber2 = new StringBuilder(strnumber1);
                        strnumber2.reverse();

                        int check = 0;
                        for(int i = 0; i < strnumber1.length(); ++i){
                            if(strnumber1.charAt(i) != strnumber2.charAt(i)){
                                break;
                            }
                            else{
                                ++check;
                            }

                        }
                        if(check == strnumber1.length()){
                            if(changeline % 10 == 0 || counter == 1){
                                System.out.println(number);
                            }
                            else{
                                System.out.print(number + " ");
                            }
                            --counter;
                            ++changeline;
                        }
                    }
                }
            }
        }

    }
}
