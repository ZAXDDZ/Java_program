package com.company;

import java.lang.Math;
import java.util.*;

public class PRINT_PRIME_NUMBER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;
        N = scanner.nextInt();
        if(N > 1) {
            FindPrime(N);
        }
    }

    public static void FindPrime(int N_inFP) {
        boolean bool;
        Vector<Integer> primList = new Vector<>();

        for (int num = 2; num <= N_inFP; num++) {

            bool = true;

            for (int div = 2; div <= Math.sqrt(num); div++) {
                if (num % div == 0) {
                    bool = false;
                    break;
                }
            }

            if (bool) {
                primList.add(num);
            }
        }

        for(int i = 0; i < primList.size(); ++i){
            if( (i +1) % 10 == 0){
                System.out.println(primList.get(i));
            }
            else if(primList.get(i) == primList.lastElement()){
                System.out.println(primList.get(i));
            }
            else{
                System.out.print(primList.get(i) + " ");
            }

        }
    }
}
