package com.company;

public class LCD_LCM {

    public static void main(String[] args){



        System.out.println(LCD(11,4));
        System.out.println(LCM(6,4));

    }


    public static int LCD(int myInt1, int myInt2){
        for(int x =((myInt1 < myInt2)? myInt1 : myInt2); x>0; x--){
            if (((myInt2 > myInt1)? myInt2 : myInt1) % x ==0){
                return x;
            }
        }
    return 0;
    }


    public static int LCM(int myInt1, int myInt2){
        int larger = ((myInt1 > myInt2)? myInt1: myInt2);
        int smaller = ((myInt2 < myInt1)? myInt2: myInt1);
        for(int x = larger; x<=larger*larger; x++){
            if (x % larger == 0 && x % smaller == 0){
                return x;
            }
        }
        return 0;
    }



}
