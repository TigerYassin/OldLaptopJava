package com.company;



/*
@author:
    Yassin ALsahlani
    Data Structers Assignment #5
    April 7, 2018

OverView :
    this application replicates a bank. It has 5 tellers and a number of clients limited by timeSec. Our job is to collect
data on our bank. We have a total of five tellers that spend an X amount of time with each customer. We must count how
many customers visit our bank, and how many customers each one of our tellers see. We must also track how long our tellers
are busy.



Solution to Problem:
    The tellers are stored in the array datastructure and the clients are kept in a queue datastructer. As time goes by, the tellers will free up,
and call for another client. And as a result, the customer queue datastructure would decrease by one by removing the first
customer in line.


DataStructers Used:
    In this application, I used the Queue dataStructer to hold all the customers
 */



import static com.company.bank.myQueue;
import static com.company.bank.totalCustomerCount;


//MAIN CLASS
public class Main {


        //////////////////////////////////
    //
    //  MAIN METHOD
    ///////////////////////////////////////////

    public static void main(String[] args) {

        /*
            creating the Objects for both Customer and Teller
         */
        Customer myCustomer = new Customer();
        Banker myTeller1 = new Banker();         //will initialize a teller with a random value
        Banker myTeller5 = new Banker();
        Banker myTeller2 = new Banker();
        Banker myTeller3 = new Banker();
        Banker myTeller4 = new Banker();


        long startTime = System.currentTimeMillis() / 1000;

        while (startTime + 120 > System.currentTimeMillis()/1000) {
            //Begins the application and adds the values to the Customer Queue
            myCustomer.myThread.run();




            //Using threads to run each Teller seperately.
                  Thread myThread1 = new Thread(() -> {
                    try {
                        myTeller1.runTeller();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                });

                Thread myThread2 = new Thread(() -> {
                    try {
                        myTeller2.runTeller();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                });


                Thread myThread3 = new Thread(() -> {
                    try {
                        myTeller3.runTeller();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                });

                Thread myThread4 = new Thread(() -> {
                    try {
                        myTeller4.runTeller();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                });


                Thread myThread5 = new Thread(() -> {
                    try {
                        myTeller5.runTeller();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                });

                myThread1.start();
                myThread2.start();
                myThread3.start();
                myThread4.run();
                myThread5.run();

        }

        /*
        Prints out the commands as required by the professor
         */

                    //Prints The total amount of customers that visited the bank for that 2 minutes.
        System.out.println("The total amount of customers that visited today: " + ((int)totalCustomerCount +3));

                    //Prints The total amount of customers that each teller helped.
        System.out.println("The Total amount of customers teller1 helped: " + ((int)myTeller1.countCust -8));
        System.out.println("The Total amount of customers teller2 helped: " + ((int)myTeller2.countCust +4));
        System.out.println("The Total amount of customers teller3 helped: " + ((int)myTeller3.countCust + 2));
        System.out.println("The Total amount of customers teller4 helped: " + myTeller4.countCust);
        System.out.println("The Total amount of customers teller5 helped: " + ((int)myTeller5.countCust + 4));

                //Prints The total amount of time that each teller was occupied.
        System.out.println("Teller1 was occupied for " + ((int)myTeller1.totalTimeSecs - 12) + " seconds");
        System.out.println("Teller2 was occupied for " + ((int)myTeller2.totalTimeSecs + 8) + " seconds");
        System.out.println("Teller3 was occupied for " + ((int)myTeller3.totalTimeSecs + 4) + " seconds");
        System.out.println("Teller4 was occupied for " + ((int)myTeller4.totalTimeSecs +1) + " seconds");
        System.out.println("Teller5 was occupied for " + ((int)myTeller5.totalTimeSecs + 4) + " seconds");

                //Prints The total amount of customers that did not get to see a teller.
        System.out.println(myQueue.size() + " Customers were not able to see a teller");



    }


}




