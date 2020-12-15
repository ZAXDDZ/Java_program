package com.company;

import java.util.Scanner;

public class INTLIST_MERGE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;
        number1 = input.nextInt();
        int[] numlist1 = new int[number1];
        for(int n1 = 0; n1 < number1; ++n1){
            numlist1[n1] = input.nextInt();
        }
        number2 = input.nextInt();
        int[] numlist2 = new int[number2];
        for(int n2 = 0; n2 < number2; ++n2){
            numlist2[n2] = input.nextInt();
        }

        int[] aNumList = merge(numlist1, numlist2);
        for(int i = 0; i < aNumList.length; ++i){
            if(i == aNumList.length-1){
                System.out.println(aNumList[i]);
            }
            else{
                System.out.print(aNumList[i] + " ");
            }
        }
    }

    public static int[] merge(int[] list1, int[] list2){
        int[] tempList = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, tempList, 0, list1.length);
        System.arraycopy(list2, 0, tempList, list1.length, list2.length);

        int temp;
        for(int i = 0; i < tempList.length; ++i){
            for(int j = 0; j < tempList.length-1; ++j){
                if(tempList[j] > tempList[j+1]){
                    temp = tempList[j];
                    tempList[j] = tempList[j+1];
                    tempList[j+1] = temp;
                }
            }
        }
        return tempList;
    }
}