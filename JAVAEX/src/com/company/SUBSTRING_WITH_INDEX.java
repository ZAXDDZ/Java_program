package com.company;

import java.util.Scanner;
import java.util.Vector;

public class SUBSTRING_WITH_INDEX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = new String();
        String sht_str = new String();

        while(input.hasNext()){
            str = input.next();
            sht_str = input.next();

            int first_ele = 0;
            int last_ele = 0;
            String substr = new String();
            Vector staringPos = new Vector();
            boolean bl = false;
            for(int i = 0; i < str.length(); ++i){
                first_ele = i;
                while(str.charAt(i) == sht_str.charAt(0)){
                    last_ele = first_ele + sht_str.length();
                    if(last_ele <= str.length()){
                        substr = str.substring(first_ele, last_ele);
                    }
                    else{
                        break;
                    }
                    if(sht_str.equals(substr)){
                        staringPos.add(i);
                    }
                    bl = true;
                    break;
                }
            }

            if(bl){
                System.out.println(sht_str + " is a substring of " + str);
                for(int j = 0; j < staringPos.size(); ++j){
                    if(j != staringPos.size() - 1){
                        System.out.print(staringPos.get(j) + " ");
                    }
                    else{
                        System.out.println(staringPos.lastElement());
                    }
                }
            }
            else{
                System.out.println(sht_str + " is not a substring of " + str);
            }
        }
    }
}