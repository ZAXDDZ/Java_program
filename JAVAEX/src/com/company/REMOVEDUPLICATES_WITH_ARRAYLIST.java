package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class REMOVEDUPLICATES_WITH_ARRAYLIST {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String type;
        type = input.next();
        input.nextLine();
        if(type.equals("Integer")){
            ArrayList<Integer> alist = new ArrayList<>();
            while(input.hasNextInt()){
                int element = input.nextInt();
                alist.add(element);
                alist = removeDuplicates(alist);
            }

            for(int i = 0; i < alist.size(); ++i){
                if(i == alist.size()-1){
                    System.out.println(alist.get(i));
                }
                else{
                    System.out.print(alist.get(i) + " ");
                }
            }
        }
        else if(type.equals("Double")){
            ArrayList<Double> alist = new ArrayList<>();
            while(input.hasNextDouble()){
                double element = input.nextDouble();
                alist.add(element);
                alist = removeDuplicates(alist);
                System.out.println(alist);
            }
            for(int i = 0; i < alist.size(); ++i){
                if(i == alist.size()-1){
                    System.out.println(alist.get(i));
                }
                else{
                    System.out.print(alist.get(i) + " ");
                }
            }
        }
        else if(type.equals("Character")){
            ArrayList<Character> alist = new ArrayList<>();
            while(input.hasNext()){
                char element = input.next().charAt(0);
                alist.add(element);
                alist = removeDuplicates(alist);
            }
            for(int i = 0; i < alist.size(); ++i){
                if(i == alist.size()-1){
                    System.out.println(alist.get(i));
                }
                else{
                    System.out.print(alist.get(i) + " ");
                }
            }
        }
        else if(type.equals("String")){
            ArrayList<String> alist = new ArrayList<>();
            while(input.hasNext()){
                String element = input.next();
                alist.add(element);
                alist = removeDuplicates(alist);
            }
            for(int i = 0; i < alist.size(); ++i){
                if(i == alist.size()-1){
                    System.out.println(alist.get(i));
                }
                else{
                    System.out.print(alist.get(i) + " ");
                }
            }
        }

    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> suclist = list;
        int size = suclist.size();
        for(int i = 0; i < size-1; ++i){
            if(suclist.get(size-1).equals(suclist.get(i))){
                suclist.remove(suclist.get(size-1));
            }
        }
        return suclist;
    }
}