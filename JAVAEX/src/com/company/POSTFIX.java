package com.company;

import java.lang.*;
import java.util.*;

public class POSTFIX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = new String();      //set a input string
        str = input.nextLine();         //input a string


        StringTokenizer st = new StringTokenizer(str, "+,-,*,/,(,),%");     //remove operators
        int size_token = st.countTokens();  //counter the number of tokens

        double num, sum = 0;    //double type token, total of all token
        String[] numstr = new String[size_token];   //set a token array

        int cout = 0;
        while(st.hasMoreTokens()){
            numstr[cout] = st.nextToken();
            num = Double.parseDouble(numstr[cout]);
            sum = num + sum;

            ++cout;
        }   //calculate sum

        for(int i = 0; i < size_token; ++i){
            if(i == size_token - 1){
                System.out.println(numstr[i]);
            }
            else{
                System.out.print(numstr[i] + " ");
            }
        }   //print all number

        boolean bl;
        Vector v_operator = new Vector();
        for(int j = 0; j < str.length(); ++j){
            bl = Character.isDigit(Character.valueOf(str.charAt(j)));

            if(bl || str.charAt(j) == '.' ){
                continue;
            }
            else{
                v_operator.add(str.charAt(j));
            }
        }   //save all operator

        for(int k = 0; k < v_operator.size() - 1; ++k){
            System.out.print(v_operator.get(k) + " ");
        }
        System.out.println(v_operator.lastElement());
            //print all operator

        System.out.printf("%.3f\n", sum);   //print sum

    }
}
