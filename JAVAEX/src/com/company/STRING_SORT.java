package com.company;

import java.util.Scanner;

public class STRING_SORT {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str;
        str = input.next();
        str = sort(str);
        System.out.println("Sorted string is " + str);
    }

    public static String sort(String s){
        char[] strarr = new char[s.length()];
        char temp;
        for(int i = 0; i < s.length(); ++i){
            strarr[i] = s.charAt(i);
        }
        for(int i = 0; i < s.length(); ++i){
            for(int j = 0; j < s.length()-1; ++j){
                if(strarr[j] > strarr[j+1]){
                    temp = strarr[j];
                    strarr[j] = strarr[j+1];
                    strarr[j+1] = temp;
                }
            }
        }
        String restr = String.valueOf(strarr);
        return restr;
    }
}