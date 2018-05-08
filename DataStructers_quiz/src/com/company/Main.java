package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int countA = 0;
    static int countB = 0;

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a value in A's and B's");
        String user_input = myScanner.nextLine();




        System.out.println(isLanguage(user_input));
    }

    public static Boolean isLanguage(String myString) {
        if (!(myString.length() == 0)) {

            if (myString.charAt(0) == 'A') {
                countA++;
            } else if (myString.charAt(0) == 'B') {
                countB++;
            }
            return isLanguage(myString.substring(1));
        }

        if (countA * 2 == countB) {
            return true;
        }

        return false;
    }


}
