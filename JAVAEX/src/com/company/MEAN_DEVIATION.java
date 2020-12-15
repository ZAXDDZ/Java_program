package com.company;

import java.util.Scanner;

public class MEAN_DEVIATION {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number;
        double[] numlist = new double[0];
        while(input.hasNextDouble()){
            number = input.nextDouble();
            numlist = add(numlist, number);
        }

        double mean_num = mean(numlist);
        double deviation_num = deviation(numlist, mean_num);
        //d = Double.parseDouble(String.format("%.3f", d));

        System.out.println("The mean is " + mean_num);
        System.out.println("The standard deviation is " + deviation_num);
    }

    public static double[] add(double[] arr, double number){
        double[] tempArr = new double[arr.length+1];
        System.arraycopy(arr, 0, tempArr, 0, arr.length);
        tempArr[arr.length] = number;
        return tempArr;
    }

    public static double mean(double[] arr){
        double mean_num = 0;
        for(int i = 0; i < arr.length; ++i){
            mean_num = Double.sum(mean_num, arr[i]);
        }
        mean_num /= arr.length;
        return mean_num;
    }

    public static double deviation(double[] arr, double mean_num){
        double deviation_num = 0;
        for(int i = 0; i < arr.length; ++i){
            deviation_num = Double.sum(deviation_num, Math.pow( (arr[i] - mean_num), 2));
        }
        deviation_num /= (arr.length - 1);
        deviation_num = Math.sqrt(deviation_num);
        return deviation_num;
    }
}