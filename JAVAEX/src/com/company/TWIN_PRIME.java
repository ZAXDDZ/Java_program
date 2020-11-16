package com.company;

public class TWIN_PRIME {

    public static void main(String[] args) {

        boolean bl;
        int prime = 2;
        int pre_prime = 2;
        for(int num = 2; num <= 1000; ++num){
            bl = true;
            for(int div = 2; div <= Math.sqrt(num); ++div ){
                if(num % div == 0){
                    bl = false;
                    break;
                }
            }


            if(bl){
                pre_prime = prime;
                prime = num;
                if(prime - pre_prime == 2){
                    System.out.printf("(%d, %d)\n", pre_prime, prime);
                }
            }
        }
    }
}