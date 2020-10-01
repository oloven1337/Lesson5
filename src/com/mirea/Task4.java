package com.mirea;

public class Task4 {
    public static int recursion(int length, int sum, int k, int s) {
        if (length == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (length == 0 ? 1 : 0); //тернарный оператор
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion(length + 1, sum + i, k, s);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(recursion(0, 0, 4, 9));
    }
}