package com.company;

import java.util.Scanner;

public class BINARY_TO_DECIMAL_FUNC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String binarynum = new String();
        int decimalnum;
        while(scan.hasNext()){
            binarynum = scan.next();
            decimalnum = Integer.parseInt(binarynum,2);

            System.out.println(decimalnum);
        }
    }
}

