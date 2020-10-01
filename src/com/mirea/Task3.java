package com.mirea;

public class Task3 {
    public static String recursion(int a, int b) {
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a - 1, b);
        } else {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a + 1, b);
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(45, 39));
        System.out.println(recursion(25, 27));
    }
}