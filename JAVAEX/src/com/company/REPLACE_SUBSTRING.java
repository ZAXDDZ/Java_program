package com.company;

import java.util.Scanner;

public class REPLACE_SUBSTRING {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int times;
        times = input.nextInt();
        input.nextLine();
        while(times != 0){
            String str;
            String substr;
            String setstr;
            str = input.nextLine();
            substr = input.nextLine();
            setstr = input.nextLine();
            str = str.replaceAll(substr, setstr);

            StringBuffer sb = new StringBuffer(str);
            sb.reverse();

            System.out.println(sb);
            --times;
        }
    }
}