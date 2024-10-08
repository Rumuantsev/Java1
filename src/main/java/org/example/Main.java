package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("0: Exit;");
        System.out.println("1-5: Ex1-Ex5;");
        System.out.println("6: All;");
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("Input: ");
            int ex = in.nextInt();

            switch (ex) {
                case 0:
                    return;
                case 1:
                    System.out.print("Result: ");
                    System.out.println(ex1(500));
                    continue;
                case 2:
                    System.out.print("Result: ");
                    System.out.println(ex2("make install"));
                    continue;
                case 3:
                    System.out.print("Input a: ");
                    int a = in.nextInt();
                    System.out.print("Input b: ");
                    int b = in.nextInt();
                    System.out.print("Input c: ");
                    int c = in.nextInt();
                    System.out.print("Result: ");
                    if(a == 0){
                        System.out.println("'a' must be not zero!");
                        continue;
                    }
                    System.out.println(ex3(a, b, c));
                    continue;
                case 4:
                    System.out.print("Result: ");
                    System.out.println(ex4(2));
                    continue;
                case 5:
                    System.out.print("Input string: ");
                    String input = in.next();
                    System.out.print("Result: ");
                    System.out.println(ex5(input));
                    continue;
                case 6:
                    System.out.println("Ex1: ");
                    System.out.print("Result: ");
                    System.out.println(ex1(500));
                    System.out.println(" ");

                    System.out.println("Ex2: ");
                    System.out.print("Result: ");
                    System.out.println(ex2("make install"));
                    System.out.println(" ");

                    System.out.println("Ex3: ");
                    System.out.println("Input: a: 3; b: 2; c: 4");
                    System.out.print("Result: ");
                    System.out.println(ex3(3,2,4));
                    System.out.println(" ");

                    System.out.println("Ex4: ");
                    System.out.print("Result: ");
                    System.out.println(ex4(2));
                    System.out.println(" ");

                    System.out.println("Ex5: ");
                    System.out.println("Input: qwerrewq");
                    System.out.print("Result: ");
                    System.out.println(ex5("qwerrewq"));
                    System.out.println(" ");

                    continue;
            }
            in.close();
        }
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

    public static boolean ex5(String str){
        boolean result = true;
        int startIndex = 0;
        int endIndex = str.length() - 1;
        while (startIndex <= endIndex){
            if(str.charAt(startIndex) != str.charAt(endIndex)){
                result = false;
                return result;
            }
            ++startIndex; --endIndex;
        }
        return result;
    }
}