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
}