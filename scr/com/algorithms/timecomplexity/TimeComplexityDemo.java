package com.algorithms.timecomplexity;

public class TimeComplexityDemo {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println("findSum(9999) = " + findSum(9999));
        System.out.println("Time taken - " + (System.currentTimeMillis()-now) + " millisecs.");
    }

//    public static int findSum(int i) {
//        return i*(i+1)/2;
//    }

    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i<=n;i++) {
            sum += i;
        }
        return sum;
    }
}
