import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;



/*
elevator class is suppose to simulate an elevator.
The floors it stops at are generated through random values thrown in an array.
It stops at 8 floors going up and 5 floors going down.
If must remain on its journey on the specified route that it given. If it was going it, it must remain going up until
it reaches the topmost floor. Then when it goes down, it must continue going down and not switch direction, unless it has
finished its journey and reached the lowest floor.
 */


/*
A good solution to this problem is to start off by creating an elevator class.The elevator class has methods that
would generate the random floors and place them in an Arraylist composed of ONLY integers.
 */
public class elevator {


//global variable int x passed. used in every method so i didn't want to instantiate it every time.
    private int x;


    /*
    Start off by creating the Arraylist that has the floors for the upward direction and name the method used to create it "generatedUpward()".
    Method doesn't take any parameters.
    Run a loop that generates random numbers from 2-12 inclusive. I used the ThreadLocalRandom library but there are
    multiple way of doing this.
    To make sure that non of the values are repeating, the loop that should be used is a while loop: while non of the new
    generated characters are not present in the Arraylist, then it should be added to the datastructure. If the new generated
    character already exists in the arraylist, then skip it and generate another one. Keep doing so until the Arraylist is
    populated with a total of 8 indecies.

    After you generate the Arraylist, you must then order it from least to greatest. I also used a library for this
    but there are numerous ways of doing this.
    Then returned the new ordered Arraylist
     */

    public ArrayList<Integer> generateUpward(){

        ArrayList<Integer> goingUp = new ArrayList<Integer>();
        x = 0;

        while (x < 8) {
            int randomNum = ThreadLocalRandom.current().nextInt(2, 12 + 1);
            if (!goingUp.contains(randomNum)) {
                goingUp.add(randomNum);
                x++;
            }
        }

        Collections.sort(goingUp);
        return goingUp;
    }


    /*
    Did the same as the above method but this time instead of generating the values for the upward route, we generate the
    values for the downward route and enter teh values into another arraylist with ONLY integers.

    Instead of generating 8 values, we generate 5 values, non-repeating. We then order it in decending order.
    returns the new ordered arraylist.
     */

    public ArrayList<Integer> generateDownward(){


        ArrayList<Integer> goingDown = new ArrayList<Integer>();
        x = 0;
        while (x<5) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 12 + 1);
            if (!goingDown.contains(randomNum)) {
                goingDown.add(randomNum);
                x++;
            }
        }

        Collections.sort(goingDown, Collections.reverseOrder());
        return goingDown;
    }




/*
Created a third method for the motion of the elevator. It takes in the two ArrayLists as parameters.
Starts from teh first floor and moves to the next floor on the cue. If the next floor is not selected, then
it prints out "Going Up: Now at floor #numOfFloor. But if the floor is selected, then it will print out "Stopping at floor:
#numOfFloor for 3 seconds. I used the TimeUnit library to make sure it only sleeps for 3 seconds. Had to use a try catch to catch
the InterruptedException.

The method doesn't return anything.

 */
    public void movingElavator(ArrayList<Integer> generateUpward, ArrayList<Integer> generateDownward){
        System.out.println("Starting at floor 1");
      for(int x = 1; x<=generateUpward.get(7); x++){
         System.out.println("Going Up: Now at floor " + x);
         if (generateUpward.contains(x)){
             System.out.println("Stopping at floor: " + x + " for 3 seconds");


             try {
                 TimeUnit.SECONDS.sleep(3);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }

             System.out.println("\b Starting at floor " + x);
         }
      }

      int tempVal = (generateUpward.get(7) > generateDownward.get(0)) ? generateUpward.get(7) : generateDownward.get(0);

      for(int x = tempVal; x >0; x--){
          System.out.println("Going Down: Now at floor " + x);
          if (generateDownward.contains(x)) {
              System.out.println("Stopping at floor: " + x + " for 3 seconds");

              try {
                  TimeUnit.SECONDS.sleep(3);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

              System.out.println("\b Starting at floor" + x);

          }
      }
    }

/*
constructor created to access class.
 */

public elevator() {}

}

