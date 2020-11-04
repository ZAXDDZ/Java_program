package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Stack;

public class POSTFIX_LINE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNextLine()){
            String str = new String();      //set a input string
            str = input.nextLine();         //input a string

            StringTokenizer st = new StringTokenizer(str, "+-*/()%", true);     //remove operators
            int size_st = st.countTokens();  //counter the number of tokens
            String[] numstr = new String[size_st];   //set a token array

            int cout = 0;
            while(st.hasMoreTokens()){
                numstr[cout] = st.nextToken();
                ++cout;
            }   //calculate sum

            Stack sk = new Stack();
            String postfix = new String();

            int i = 0;
            while(i != size_st){

                if(numstr[i].equals("(")){
                    sk.push(numstr[i]);
                }

                else if(numstr[i].equals(")")){
                    if(!sk.isEmpty()){
                        while(!sk.peek().equals("(")){
                            postfix += sk.pop() + " ";
                        }
                    }
                    sk.pop();
                }

                else if(numstr[i].equals("+") || numstr[i].equals("-")){
                    if( sk.isEmpty() || sk.peek().equals("(") ) {
                        sk.push(numstr[i]);
                    }
                    else{
                        while ( !sk.isEmpty() && !sk.peek().equals("(") ) {
                            postfix += sk.pop() + " ";
                        }
                        sk.push(numstr[i]);
                    }
                }

                else if( numstr[i].equals("*") || numstr[i].equals("/") || numstr[i].equals("%") ){
                    if( sk.isEmpty() || sk.peek().equals("+") || sk.peek().equals("-") || sk.peek().equals("(") ){
                        sk.push(numstr[i]);
                    }
                    else{
                        while( !sk.isEmpty() && !sk.peek().equals("+") && !sk.peek().equals("-") && !sk.peek().equals("(") ){
                            postfix += sk.pop() + " ";
                        }
                        sk.push(numstr[i]);
                    }
                }

                else{
                    postfix += numstr[i] + " ";
                }

                if(i == size_st-1){
                    while(!sk.isEmpty()){
                        postfix += sk.pop() + " ";
                    }
                }

                ++i;
            }

            System.out.println(postfix);
        }
    }
}