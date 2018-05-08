package com.company;

import java.util.Scanner;

public class weekdays {

    public static void main(String[] args){
        System.out.println("Enter a number between 1 and 7");
        Scanner myScanner = new Scanner(System.in);
        int dayNum = myScanner.nextInt();

        String day;

        switch (dayNum){
            case 1:
                day = "Monday, Weekday";
                break;
            case 2:
                day = "Tuesday, Weekday";
                break;
            case 3:
                day = "Wednesday, Weekday";
                break;
            case 4:
                day = "Thursday, Weekday";
                break;
            case 5:
                day = "Friday, Weekday";
                break;
            case 6:
                day = "Saturday, Weekend";
                break;
            case 7:
                day = "Sunday, Weekend";
                break;
            default:
                day = "You entered an incorrect value";
                break;
        }

        System.out.println(day);


    }





}
