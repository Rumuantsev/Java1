package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Ex: ");
        int ex = in.nextInt();
        switch(ex){
            case 1:
                List<String> result = ex1(7);
                System.out.println(result);
            case 2:

        }
        in.close();
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
}