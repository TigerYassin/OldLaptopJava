package com.company;

import java.io.*;
import java.util.*;

public class practice {

    public static void main(String[] ars){
        Object[] mylist = new Object[21];
        String myString = "";

        try {
//            BufferedWriter myWriter = new BufferedWriter(new FileWriter("practice"));
            BufferedReader myBuff = new BufferedReader(new FileReader("practice"));
            for (int x = 0; x < 4; x ++) {
                myString = myString + myBuff.readLine();
            }

            System.out.println(Arrays.toString(myString.split(" ")));
            for (int x =0; x < myString.split(" ").length; x++){
                mylist[x] = myString.split(" ")[x];
            }

            System.out.println(Arrays.toString(mylist));

            if (mylist[0].getClass().getName() == "java.lang.String"){
                int myInt = Integer.parseInt(mylist[1].toString()) +  + Integer.parseInt(mylist[2].toString())
                        + Integer.parseInt(mylist[3].toString());
                System.out.println(mylist[0] + " Came in first place and spent a total of: " + myInt + " Min");
            }


            myBuff.close();

//            myWriter.write("here is some code");
//            myWriter.close();
        }catch (IOException e){
            System.out.println("File not found");
        }

    }
}
