package com.company.Labquiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {


    public static void main(String[] args){

        ArrayList<Integer> myArrayList = new ArrayList<>(); //initializing the arraylist
        for (int x = 0; x < 25; x++){   //using the for loop to populate the arraylist with 25 random values ranging between 1 to 50
            Random myRandom = new Random();
            myArrayList.add(myRandom.nextInt(50)+1);
        }
        Collections.sort(myArrayList); //sort the array in increasing order

        Main myMain = new Main(); //creating object to access the recursive method

        System.out.println(myArrayList);
        myMain.recursive(myArrayList); //calling the recursive method and passing myArrayList as its only parameter
        System.out.println(myArrayList); //arraylist is not modified and the size remains the same

    }
    public int num = 0; //creating a variable so that we only cycle through the method a set number amount of times

    public void recursive(ArrayList<Integer> myArray){
        if (this.num < 25){    //will print out all the values in our arraylist one by one
            System.out.println(myArray.get(this.num));
            this.num++;
            recursive(myArray);  //calling recursive method again with the same arraylist

        }



    }

}
