package com.company;

import static java.lang.Thread.sleep;



/*
    Teller calls
        Handles the functionality of our tellers. Each teller will be built like this.
 */
public class Banker extends bank{

    /*
    Creating our class variables
     */
    int countCust = 1;                                                  //Keeps count of each customer that the teller sees
    int timeMilliSecs = (myRand.nextInt(4) + 2) * 1000;     //Counts time a teller spent with a given customer. Milliseconds
    int totalTimeSecs = timeMilliSecs / 1000;                           //Counts the total amount of time a teller spent occupied

/*

    runTeller Method
    @params = none
    @result = void

 */
    public void runTeller() throws InterruptedException {
        System.out.println("1"); //stage 1 reached

        /*
        checks to see if the customer queue has values. The teller will rest if no customers are available.
         */
        if (!myQueue.isEmpty()){
            System.out.println("2");                            //stage 2 reached
            myQueue.poll();
            this.countCust ++;                                     //increase count by one
            this.timeMilliSecs = (myRand.nextInt(4) + 2) * 1000;
            this.totalTimeSecs += timeMilliSecs / 1000;
            sleep(timeMilliSecs);                                   //take care of customer for a given amount of time
            System.out.println("3");                        //reached stage 3. Final stage for transaction. Customer left

        }
        else sleep(2000);
    }


}
