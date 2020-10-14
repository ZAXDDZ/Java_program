package com.company;

import java.util.Scanner;


public class ELEVEN_MULTIPLE {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String number;
        int oddcouter;
        int evencouter;

        while(scan.hasNext()){

            oddcouter = 0;
            evencouter = 0;

            number = scan.nextLine();

            if(number.equals("0")){
                break;
            }

            for(int i = 0; i < number.length(); ++i){
                if(i % 2 == 0){
                    oddcouter += Integer.valueOf(number.charAt(i) - 48);
                }
                else{
                    evencouter += Integer.valueOf(number.charAt(i) - 48);
                }
            }

            if(Math.abs(oddcouter-evencouter) % 11 == 0){
                System.out.println(number + " is a multiple of 11.");
            }
            else{
                System.out.println(number + " is not a multiple of 11.");
            }

        }

    }
}