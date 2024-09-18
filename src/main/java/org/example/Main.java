package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Main {
    public static void main(String[] args) {
        System.out.println(ex4(2));
        /*Scanner in = new Scanner(System.in);
        System.out.print("Input Ex: ");
        int ex = in.nextInt();

        switch(ex){
            case 1:
                List<String> result = ex1(500);
                System.out.println(result);
            case 2:

        }
        in.close();*/
    }
    public static List<String> ex1(int n){
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            if (i % 5 == 0) {
                if (i % 7 == 0)
                    result.add("fizzbuzz");
                else
                    result.add("fizz");
            } else if (i % 7 == 0) {
                result.add("buzz");
            } else
                result.add(String.valueOf(i));
        }
        return result;
    }

    public static String ex2(String input){
        String str = "";
        int inputIndex = input.length() - 1;
        while(inputIndex >= 0){
            str = str + input.charAt(inputIndex);
            --inputIndex;
        }
        return str;
    }

    public static List<String> ex3(double a, double b, double c){
        List<String> result = new ArrayList<>();
       double D = (b * b) - (4 * a * c);
       double x = 0;
       if (D < 0){
            result.add("There are no real roots!");
       } else if (D == 0) {
            x = (b * -1) / (2 * a);
           result.add(String.valueOf(x));
       } else if (D > 0) {
           x = ((b * -1) + sqrt(D)) / (2 * a);
           result.add(String.valueOf(x));
           x = ((b * -1) - sqrt(D)) / (2 * a);
           result.add(String.valueOf(x));
       }
       return result;
    }

    public static double ex4(double n){
        double index = 1 / (n*n + n - 2);
        double result = 0;
        while (index >= pow(10, -6)){
            index = 1 / (n*n + n - 2);
            result += index;
            ++n;
        }
        return result;
    }
}