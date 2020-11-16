package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BIGDECIMAL_CALCULATE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNextLine()){
            String exp;
            exp = input.nextLine();
            BigDecimal_calculate(exp);
        }

    }

    public static void BigDecimal_calculate(String exp){
        exp = exp.replaceAll("\\s", "");
        StringTokenizer sk = new StringTokenizer(exp, "+-*/% ", true);
        String[] exp_str = new String[sk.countTokens()];
        int i = 0;
        while(sk.hasMoreTokens()){
            exp_str[i] = sk.nextToken();
            ++i;
        }
        BigDecimal result;

        if(!exp_str[0].equals("-")){
            result = new BigDecimal(exp_str[0]);
            BigDecimal temp = new BigDecimal("0");
            boolean c1 = Arrays.asList(exp_str).contains("*");
            boolean c2 = Arrays.asList(exp_str).contains("/");
            boolean c3 = Arrays.asList(exp_str).contains("%");
            int set = 0;
            if(c1 || c2 || c3){
                result = BigDecimal.ZERO;
                for(int j = 1; j < exp_str.length - 1; ++j){
                    set = 0;
                    if(exp_str[j].equals("*")){
                        if(result.equals(BigDecimal.ZERO)){
                            result = new BigDecimal(exp_str[j-1]);
                        }
                        result = result.multiply(new BigDecimal(exp_str[j+1])) ;
                        set = i;
                    }
                    else if(exp_str[j].equals("/")){
                        if(result.equals(BigDecimal.ZERO)){
                            result = new BigDecimal(exp_str[j-1]);
                        }
                        result = result.divide(new BigDecimal(exp_str[j+1]), 1,RoundingMode.CEILING);
                        set = i;
                    }
                    else if(exp_str[j].equals("%")){
                        if(result.equals(BigDecimal.ZERO)){
                            result = new BigDecimal(exp_str[j-1]);
                        }
                        result = result.remainder(new BigDecimal(exp_str[j+1]));
                        set = i;
                    }
                }
            }
            for(int k = 1; k < exp_str.length - 1; ++k){
                if(exp_str[k].equals("+")){
                    if(set < k){
                        result = result.add(new BigDecimal(exp_str[k+1]));
                    }
                    else{
                        result = result.add(new BigDecimal(exp_str[k-1]));
                    }
                }
                if(exp_str[k].equals("-")){
                    if(set < k){
                        result = result.subtract(new BigDecimal(exp_str[k+1]));
                    }
                    else{
                        result = new BigDecimal(exp_str[k-1]).subtract(result);
                    }
                }
            }

            if(exp_str.length > 1){
                for(int out = 0; out < exp_str.length; ++out){
                    if(exp_str[out].equals("+") || exp_str[out].equals("-") || exp_str[out].equals("*") || exp_str[out].equals("/") || exp_str[out].equals("%")){
                        System.out.print(exp_str[out] + " ");
                    }
                    else if(out != exp_str.length - 1){
                        System.out.printf("%.1f ", new BigDecimal(exp_str[out]));
                    }
                    else{
                        System.out.printf("%.1f = ", new BigDecimal(exp_str[out]));
                    }
                }
            }
        }
        else{
            result = new BigDecimal(exp_str[1]);
            System.out.print("-");
        }
        System.out.printf("%.1f\n", result);
    }
}