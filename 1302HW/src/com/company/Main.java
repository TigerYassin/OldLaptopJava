package com.company;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //running first Hello world thread from other class
        Thread mythread = new Thread(new UniqueThread());

        //using anonymous classes to create the five threads
        //starting thread 1
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                System.out.println("Hello World");
            }
        };

        //starting thread 2
        Thread thread2 = new Thread(){
            public void run(){
                System.out.println("Hello World");
            }
        };

        //starting thread 3
        Thread thread3 = new Thread() {
            public void run(){
                System.out.println("Hello World");
            }
        };

        //starting thread 4
        Thread thread4 = new Thread() {
            public void run(){
                System.out.println("Hello World");
            }
        };

        //starting thread 5
        Thread thread5 = new Thread() {
            public void run(){
                System.out.println("Hello World");
            }
        };



        mythread.start();//runs the first thread from the other class

        //runs the 5 threads from the anonymous classes
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


        //setting the names for each of the threads
        thread1.setName("ONE");
        thread2.setName("TWO");
        thread3.setName("THREE");
        thread4.setName("FOUR");
        thread5.setName("FIVE");


        //printing out the names of the threads
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
        System.out.println(thread3.getName());
        System.out.println(thread4.getName());
        System.out.println(thread5.getName());




    }


    public static class UniqueThread implements Runnable{

        @Override
        public void run(){
            System.out.println("Hello World - First one");
        }

    }


}
