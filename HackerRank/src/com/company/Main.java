package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(aVeryBigSum(5, new long[]{1000000001, 1000000002, 1000000003,1000000004,1000000005}));

    }

    static long aVeryBigSum(int n, long[] ar) {

        long longNum = 0;
        for (long num : ar){
            longNum = num + longNum;
        }
        return longNum;

    }
}
