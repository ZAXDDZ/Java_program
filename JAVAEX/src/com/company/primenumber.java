package com.company;

import java.lang.Math;
import java.util.concurrent.atomic.AtomicInteger;

public class primenumber {

    public static void main(String[] args) {
	    System.out.println("Print 1~100 prime number");
	    boolean bool;
	    int counter = 0;
        for(int num = 2; num <= 100; num++){
            bool = true;
            for(int div = 2; div <= Math.sqrt(num); div++ ){
                if(num % div == 0){
                    bool = false;
                    break;
                }
            }
            if(bool){
                if(num < 10) {
                    System.out.print(num + "  ");
                }
                else{
                    System.out.print(num + " ");
                }
                counter++;
            }
            if(counter == 5){
                System.out.println();
                counter = 0;
            }
        }
    }
}
