package org.example;

public class Calculator {
    public int add (int a, int b) {
        return a + b;
    }

    public int subtract (int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public double sharing(int a, int b) {
        if (b == 0) {
            return -100;
        } else {
            return a / b;
        }
    }
}