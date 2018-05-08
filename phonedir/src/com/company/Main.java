
package com.company;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static javafx.application.Platform.exit;

/* this is a program that replicates a real life phone directory. This application would store first name, last name,
and phone number of each person in the directory.

I wanted to challenge myself by only using one class to run everything. To make this project possible, I am using an
arraylist to store all the objects. If the user wishes to change a certain feature of a person in the arraylist, then
they can do so by entering the appropriate command. They can also add more people to the phone directory along with removing
people and changing from person to person by entering the corresponding keys. Whenever the user is done with the application,
they can enter the q character, and it will exit the program for them.

none of the methods made in this program take in any parameters, nor do they return anything. The return type for all mmethods are void
 */

public class Main {


    //initial the global variables that would be used throughout the program

    static ArrayList<Object> myList = new ArrayList<>(); //stores the objects
    static Scanner myScanner = new Scanner(System.in);  //gets the user input
    static String fName; //holds onto the current person's first name
    static String lName; //holds onto the current person's last name
    static String pNumber; //holds onto the current person's phone number
    static BufferedWriter myFileWriter;
    static BufferedReader myReader;


    //main method
    public static void main(String[] args) {


        //this scanner gets the option from the user
        Scanner miniScanner = new Scanner(System.in);
        String option;

        //running it through a while loop so that it runs at least once
        do {

            //Printing to the screen with the options they can enter to get results
            System.out.println("\n\nA Program to keep a Phone Directory:\n" +
                    "\n" +
                    "\n" +
                    "          a     Show all records\n" +
                    "\n" +
                    "          d     Delete the current record\n" +
                    "\n" +
                    "          f     Change the first name in the current record\n" +
                    "\n" +
                    "          l     Change the last name in the current record\n" +
                    "\n" +
                    "          n    Add a new record\n" +
                    "\n" +
                    "          o    Open file\n" +
                    "\n" +
                    "          p    Change the phone number in the current record\n" +
                    "\n" +
                    "         q     Quit\n" +
                    "\n" +
                    "         s     Select a record from the record list to become the current record\n" +
                    "\n" + "The current arraylist is: " + myList +
                    "\n" + "Enter a command from the list above (q to quit): ");

            //holding onto the option the user entered
            option = miniScanner.nextLine();

            //used a switch/case statement instead of multiple for-loops for elegant clean code.
            //which ever character the user enters, would trigger a different method
            switch (option.toLowerCase()){
                case "a":
                    showRecords();
                    break;

                case "d":
                    deleteRecord();
                    break;
                case "o":
                    openFile("myFile");

                case "f":
                    newFirstName();
                    break;

                case "l":
                    newLastName();
                    break;

                case "n":
                    addNew();
                    break;

                case "p":
                    newPhoneNumber();
                    break;

                case "q":
                    //TODO write to file
                    try {
                        myFileWriter =  new BufferedWriter(new FileWriter("myFile", true));
                        myFileWriter.write(Arrays.toString(myList.toArray()));
                        myFileWriter.close();
                    } catch (IOException e) {
                       System.out.println("File not found");
                    }
                    exit();
                    break;

                case "s":
                    changeRecord();
                    break;

                default: //default would alert the user that the key entered isn't from the menu
                    System.out.println("Illegal Command. Enter a command from the list above (q to quit):");


            }

        }while (!(option.equalsIgnoreCase("q")));//will continue looping as long as the user doesn't enter the q character


    }


    /*
    This application Opens a new file and read from it
    it then prints out the values onto the screen for the user to see
     */
    public static void openFile(String filename){
        try {
            myReader = new BufferedReader(new FileReader(filename));;
            System.out.println(myReader.readLine());
            myReader.close();
        }
        catch (IOException e){
            System.out.println("File not found");
        }
    }


    //this method adds a new person to the arraylist. It doesn't take any parameters and doesn't return anything.
    public static void addNew(){
        System.out.println("Enter first name: ");
        Object firstName = myScanner.nextLine();
        System.out.println("Enter last name:");
        Object lastName = myScanner.nextLine();
        System.out.println("Enter phone number:");
        Object phoneNumber = myScanner.nextLine();



        //stores the three Objects into a StringBuilder
        StringBuilder myBuild = new StringBuilder();
        myBuild.append(firstName + "\t");
        myBuild.append(lastName + "\t");
        myBuild.append(phoneNumber);

        System.out.println("We just added: " + myBuild);//alerts the user that they added a new user


        int num = myList.size(); //holds onto the size of the arraylist so that the for loop wont cycle forever once we add objects to the arraylist
        for (int i = 0; i < num; i++){
            if (myList.get(i).toString().compareToIgnoreCase(myBuild.toString()) > 0){ //checks which first name is would appear first if
                //it was alphabetically sorted
                myList.add(i, myBuild);
                break;
            }

        }
        if (!myList.contains(myBuild)){//if the new person's first name doesn't proceed any other person's name, then
            //it will simply add it to the end of the arraylist
            myList.add(myBuild);
        }

    }


    //this will show the values in the arraylist and print them out in a special format.
    public static void showRecords(){

        System.out.println("FName \t LName \t PHONE NUMBER");
        System.out.println("_______\t________\t___________");

        for (Object myObj : myList){
            System.out.println(myObj);
        }

    }


    //this would change the current record you are currently working on.
    //it will ask the user for a first name and a last name so that it could connect to that person
    public static void changeRecord() {
        System.out.println("What is the first name of person whose record you wish to be on?");
        fName = myScanner.nextLine();

        System.out.println("What is their last name");
        lName = myScanner.nextLine();


        for (Object x : myList){//this would cycle through all the objects in the arraylist
            if (x.toString().startsWith(fName)){
                String[] y = x.toString().split("\t");

                pNumber = y[2]; //this would store the value of the phone number into a variable
            }
        }
    }


    //this would delete the selected record based on the first name
    public static void deleteRecord(){
        for (int i =0; i < myList.size(); i++){
            if (myList.get(i).toString().startsWith(fName)){//deletes the person whose record you are currently on
                myList.remove(i);
            }
        }
    }


    //this would change the first name of the person whose record you are currently on
    public static void newFirstName(){
        System.out.println("Enter a new first name: ");//prompting the user for a new first name
        String otherFName = myScanner.nextLine();
        Object extended = otherFName + "\t" + lName + "\t" + pNumber;//storing the new values into an object so that it can be appended into the arraylist
        System.out.println("Current record is: " + extended);


        //this is a for loop that would change the first name of the person whose record you are currently on
        //since we have to SORT THE ARRAYLIST BY FIRST NAME, I had to write an algorythm that would append to the arraylist appropriately

        for (int i = 0; i < myList.size(); i++){
            if (myList.get(i).toString().startsWith(fName)){
                myList.remove(i);

                fName = otherFName;

                int num = myList.size();
                for (int k = 0; k < num; k++){
                    if (myList.get(k).toString().compareToIgnoreCase(fName.toString()) > 0){ //checks to see if the selected first name proceeds the other first name values
                        myList.add(k, extended); //adds the values in its proper position so that it remains sorted
                        break;
                    }

                }
                if (!myList.contains(extended)){
                    myList.add(extended); // this would append the new string to the last index of the arraylist if it
                    //doesn't proceed anything else alphabetically
                }
                break;
            }
        }
        fName = otherFName; //saves the new first name
    }


    //this method would change the last name of the person whose record we are on
    public static void newLastName(){

        System.out.println("Enter a new last name: "); //prompts the user for a new input on the last name of the selected person
        String otherLastName = myScanner.nextLine();
        Object extended = fName + "\t" + otherLastName + "\t" + pNumber; //stores the first name, last name, and phone number into an object


        //cycles through the arraylist and appends the new value appropriately so that the sorted order remains.
        for (int i = 0; i < myList.size(); i++){
            if (myList.get(i).toString().startsWith(fName)){
                myList.remove(i);
                myList.add(i, extended);
                break;
            }

        }
        lName = otherLastName;
    }


    //this method changes the phone number of the selected person whose record you are currently working on
    public static void newPhoneNumber(){
        System.out.println("Enter a new Phone Number: ");
        String otherPhoneNumber = myScanner.nextLine();
        Object extended = fName + "\t" + lName + "\t" + otherPhoneNumber; //stores the first name, last name, and new phone number into an object

        //changes the values of the arraylist appropriately so that the sorted order isn't altered incorrectly
        for (int i = 0; i < myList.size(); i++){
            if (myList.get(i).toString().startsWith(fName)){
                myList.remove(i);
                myList.add(i, extended);
                break;
            }
        }
        //changes the global variable "pNumber" to the new value that the user has entered
        pNumber = otherPhoneNumber;
    }


}

//end of application