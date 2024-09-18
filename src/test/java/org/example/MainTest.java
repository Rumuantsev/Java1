package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void ex1() {
        String[] testArray = {"1", "2","3", "4", "fizz", "6", "buzz"};
        List<String> test = Arrays.asList(testArray);
        assertEquals(test, Main.ex1(7));
    }

    @Test
    void ex2() {
        String testString = "llatsni ekam";
        assertEquals(testString , Main.ex2("make install"));
    }

    @Test
    void ex3() {
        double a, b, c;
        a = -6; b = 0; c = 54;
        String[] testArray1 = {"-3.0", "3.0"};
        List<String> test1 = Arrays.asList(testArray1);
        assertEquals(test1, Main.ex3(a, b, c));
        a = -4; b = 28; c = -49;
        String[] testArray2 = {"3.5"};
        List<String> test2 = Arrays.asList(testArray2);
        assertEquals(test2, Main.ex3(a, b, c));
        a = 3; b = -4; c = 94;
        String[] testArray3 = {"There are no real roots!"};
        List<String> test3 = Arrays.asList(testArray3);
        assertEquals(test3, Main.ex3(a, b, c));
    }
}