package com.company;

import java.util.Arrays;

public class practice {

    public static void main(String[] args){

        arrayMystery(new int[]{42,42});
    }

    public static void arrayMystery(int[] a){

        for (int x = 1; x < a.length; x++){
            a[x] = a[a.length -1 -x] - a[x-1];
        }
        System.out.println(Arrays.toString(a));
    }
}
