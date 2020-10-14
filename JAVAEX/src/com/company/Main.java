package com.company;

import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month, year;

        while(scan.hasNext()) {
            month = scan.nextInt();
            year = scan.nextInt();

            switch (month) {
                case 1:
                    System.out.println("January " + year + " had 31 Days");
                    break;
                case 2:
                    LunarYear(year);
                    break;
                case 3:
                    System.out.println("March " + year + " had 31 Days");
                    break;
                case 4:
                    System.out.println("April " + year + " had 30 Days");
                    break;
                case 5:
                    System.out.println("May " + year + " had 31 Days");
                    break;
                case 6:
                    System.out.println("June " + year + " had 30 Days");
                    break;
                case 7:
                    System.out.println("July " + year + " had 31 Days");
                    break;
                case 8:
                    System.out.println("August " + year + " had 31 Days");
                    break;
                case 9:
                    System.out.println("September " + year + " had 30 Days");
                    break;
                case 10:
                    System.out.println("October " + year + " had 31 Days");
                    break;
                case 11:
                    System.out.println("November " + year + " had 30 Days");
                    break;
                case 12:
                    System.out.println("December " + year + " had 31 Days");
                    break;
                default:
                    break;
            }
        }
    }

    public static void LunarYear(int yr){
        if(yr % 4 == 0 && yr % 100 != 0){
            System.out.println("February "+ yr +" had 29 Days");
        }
        else if(yr % 400 == 0){
            System.out.println("February "+ yr +" had 29 Days");
        }
        else if(yr % 1000 == 0){
            System.out.println("February "+ yr +" had 29 Days");
        }
        else{
            System.out.println("February "+ yr +" had 28 Days");
        }
    }
}

