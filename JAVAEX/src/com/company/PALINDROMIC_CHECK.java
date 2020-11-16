package com.company;

import java.util.Scanner;
import java.lang.StringBuilder;
import java.lang.String;

public class PALINDROMIC_CHECK {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()){
            String number;
            number = input.next();
            StringBuffer rev_num = new StringBuffer(number);
            rev_num.reverse();
            int size = number.length();

            boolean bl = false;
            for(int i = 0; i < size; ++i){
                if(number.charAt(i) == rev_num.charAt(i)){
                    bl = true;
                }
                else{
                    break;
                }
            }
            if(bl){
                System.out.println(number + " is palindrome");
            }
            else{
                System.out.println(number + " is not palindrome");
            }
        }
    }
}