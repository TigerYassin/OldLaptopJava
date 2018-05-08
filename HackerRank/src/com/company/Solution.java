package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String birthdayCakeCandles(String s) {

        String[] myArray = s.split(":");
        if (myArray[2].toString().contains("PM") && !(myArray[0].equals("12"))){

            int myInt = Integer.parseInt(myArray[0]);
            myArray[0] = String.valueOf(myInt + 12);
        }
        if (myArray[2].toString().contains("AM") && myArray[0].equalsIgnoreCase("12")){
            myArray[0] = "00";
        }


        return myArray[0] +":" + myArray[1] + ":" + myArray[2].substring(0,2);

    }

    public static void main(String[] args) {

        System.out.println(birthdayCakeCandles("12:05:45PM"));

        
    }
}
