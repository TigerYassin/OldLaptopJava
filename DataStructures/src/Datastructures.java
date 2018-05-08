
import java.util.ArrayList;
import java.util.Scanner;


/*

Class Datastructures created to run the elevator class.
This class has the main method.
 */


public class Datastructures {

    public static void main(String[] args){

        int myInt;

        /*
        created a do while loop so that the code runs atleast once.
        Instantiated an elevator object.
         */
        do {

            elevator myElevator = new elevator();

                //used the generateUpward() method to populate the valuesUp arraylist
            ArrayList<Integer> valuesUp = myElevator.generateUpward();
                //used the generateDownward() method to poupulate the valuesDown arraylist
            ArrayList<Integer> valuesDown = myElevator.generateDownward();

                //moved the elevator with the two arraylists created as parameters.
           myElevator.movingElavator(valuesUp, valuesDown);

            //Used a scanner to collect user input. If User inputs the number 1, then they want to rerun the program.
            //If the user enters a 0, then the program would exit.
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Do you wish to continue? Enter 1 for yes, and 0 for no.");
            myInt = myScanner.nextInt();

            //If the user enters any other numerical value, then it would tell them to try again, and either enter a 1 or 0.
            while(!(myInt == 0 ||myInt == 1)){
                System.out.println("You entered an incorrect value. Try again. Enter 1 to repeat, enter 0 to quit.");
                myInt = myScanner.nextInt();
            }
            //the loop would continue to run until the number 0 is entered.
        }while (myInt ==1);

    }
}
