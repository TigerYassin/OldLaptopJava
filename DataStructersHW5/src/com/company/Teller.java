package com.company;

import java.util.NoSuchElementException;
import java.util.Random;


/*
        Teller Class
            This class countains the old code that didn't work
            I tried to thread each teller but if I put it in the while loop, then it would have made numerous amounts
            of threads that are unwanted

            CLASS NOT USED IN END RESULT
            --SEE BANKER CLASS--
 */
public class Teller extends bank{


    int count = 1;                                              //Count Customers seen by Teller
    int timeSec = (new Random().nextInt(4) +2) * 1000;            //Counts Time spent with each customer in seconds
    int totalTimeSec;                  //Counts the total timeSec spent occupied

    /*
        Creating a thread so that the teller would be able to pull from the quoue and be occupied for the unique given time
        The thread overides the run() method from the Runnable interface in the form of the anonymous class
     */
    Thread myThread = new Thread(){
        @Override
        public void run(){
            try {
                if (!myQueue.isEmpty()) {
                    timeSec = (int)myQueue.poll() * 1000; //stores the value of the queue in a datatype so that
                                                                 //the Teller would be occupied until the timeSec is up
                    count++;
                    totalTimeSec += (timeSec / 1000);
                    sleep(timeSec);                  //sleeping the teller

                }
                    //If the queue is empty then the teller will sleep for 2000 milliseconds
                else {
                    sleep(2000);
                }
            }

                //catches if we call for the head of the queue but it is empty
                catch (NullPointerException e){
                }
                catch (InterruptedException e) {
                }
                 catch (NoSuchElementException e){
                     try {
                         sleep(new Random().nextInt(4) +2 * 1000);
                     } catch (InterruptedException e1) {
                     }
                 }
        }

    };




//    //Run Teller Method
//
//
//    /*
//@param = none
//@return = null
//this method replicates the teller
//todo
//    Start off with one teller and scale out and use multiple tellers
// */
//    protected static void runTeller(){
//
//        Timer myTimer = new Timer();
//        TimerTask myTask = new TimerTask() {
//            @Override
//            public void run() {
//                try {
//                    timeWithTeller = (int) myQueue.peek() * 1000; //stores the value of the queue in a datatype so that
//                                                                 //the Teller would be occupied until the timeSec is up
//                    System.out.println(myQueue.poll());
//                    count++;
//                    totalTimeSec += timeWithTeller / 1000;
//
//                }
//                catch (NullPointerException e){
//                    System.out.println("Error");
//                }
//
//            }
//        };
//
//        //1000 milisconds = 1 second
////        myTimer.scheduleAtFixedRate();
//        myTimer.schedule(myTask, timeSec * 1000, timeWithTeller);
//        timeWithTeller = 5;
//
//    }






    //Constructors
    public Teller (int totalTimeSec){ //takes timeSec from random input
        this.timeSec = totalTimeSec;
    }
    public Teller(){}








}
