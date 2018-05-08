package com.company;


import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Thread.sleep;

/*
    This is the Customer Class. This class is responsible for entering our customers in an appropriate queue.
    The queue will contain how long each customer will spend with one of our tellers from the teller class
 */

public class Customer extends bank{




    /*
    Created a thread object. This thread object overights the run() method in the Runnable interface using an annonymous class.
    appends a random time from 2-5 seconds that tells us how long the customer will spend with our teller.
     */
    Thread myThread = new Thread(() -> {

        myQueue.add(myRand.nextInt(4) + 2); //adds the random time value to our queue
        totalCustomerCount++;               //increase the total count of customers seen by 1
        try {                                                           //used a try catch for the sleep method to catch any interruptions
            sleep(myRand.nextInt((5) + 2) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });


    /*
    CODE BELOW WAS COMMENTED OUT
    CODE WAS NOT USED
     */

    /*
@param = none
@return = none
adds the timeSec values to the customer queue
the timeSec represents how long each customer would want to spend with the teller
the index would represent the customer id

WORKING!
 */
//    protected static void runCustomers() {


//        Timer myTimer = new Timer();
//        TimerTask myTask = new TimerTask() {
//            @Override
//            public void run() {
//
//                myQueue.add(myRand.nextInt(4) + 2);
//                totalCustomerCount++;
//                System.out.println("Working");
//
//            }
//        };

        //1000 milisconds = 1 second
//        try {
//            myTimer.scheduleAtFixedRate(myTask, 0, myRand.nextInt((5) + 2) * 1000);
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("Non-Positive int");
//        }



//    }




}
