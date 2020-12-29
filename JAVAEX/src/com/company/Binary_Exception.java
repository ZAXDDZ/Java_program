package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        while(input.hasNext()){
            str = input.next();

            try{
                MyNumberFormatException ex = new MyNumberFormatException(str);
                int counter = str.length();
                int total = 0;
                for(int i = 0; i < counter; ++i){
                    total += (str.charAt(i) - 48) * Math.pow(2, (counter-i-1));
                }
                System.out.println(total);
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }


        }
    }
}

class MyNumberFormatException extends Exception{
    private String tempStr;
    public MyNumberFormatException(String s) throws Exception {
        tempStr = s;
        for(int i = 0; i < tempStr.length(); ++i){
            if(tempStr.charAt(i)-48 == 1 || tempStr.charAt(i)-48 == 0){
            }
            else{
                throw new Exception("Incorrect Binary Format");
            }
        }
    }
}
