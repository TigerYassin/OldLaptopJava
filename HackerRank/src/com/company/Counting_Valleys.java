package com.company;

public class Counting_Valleys {

    static int countingValleys(int n, String s) {

        int currentVal = 0;
        int valleyCount = 0;

        for (int x =0; x < n; x++){
            if (s.charAt(x) == 'D'){ currentVal--; }
            else { currentVal++; }

            try {
                if ((s.charAt(x) == 'U' && s.charAt(x-1) == 'U') && (currentVal == 0)){ valleyCount++; }
                if ((s.charAt(x) == 'D' && s.charAt(x-1) == 'D') && (currentVal == 0)) { valleyCount++; }
            }catch (IndexOutOfBoundsException e){}


        }

        return valleyCount;

    }

    public static void main(String[] args){

        System.out.println(countingValleys(10, "DUDDDUUDUU"));

    }


}
