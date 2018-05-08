package com.company;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args){

        System.out.println("HELLo World");
        try {
            BufferedWriter myWriter = new BufferedWriter(new FileWriter("myFiles.txt"));
            myWriter.write("Something is going on my dude");
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("NOT FOUND");
            e.printStackTrace();
        }
    }
}
