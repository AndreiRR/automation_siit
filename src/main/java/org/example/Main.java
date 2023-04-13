package org.example;

public class Main {

    public static void main(String[] args) {
//        int sum = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
        boolean b = isOddNumber(116);
        System.out.println(b);
    }

    public static boolean isOddNumber(int n) {
        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}