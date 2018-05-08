package com.company;

public class Second {


    static int num =0;
    static int myNum = 0;

    public static void main(String[] args){

        Thread firstThread = new Thread(){
            @Override
            public void run(){
                for (int t = 0; t < 1000000; t++){
                    num++;
                }
                System.out.println(num + " first method");
            }
        };

        Thread secondThread = new Thread(){
            @Override
            public void run() {
                for (int t = 0; t<1000000; t++){
                    num++;
                }
                System.out.println(num + " Second method");
            }
        };


        //this will print both threads that were accessing the int datatype. It will give us weird values
        //because it is not synchronized, meaning that the datatype can be called in one method while still being
        //used in the before method. They will change the value in an unorthodox fashion.
        firstThread.start();
        secondThread.start();
        System.out.println(num);




        //this will make sure that each one is using its own datatype and that the actions of the other function
        //will not affect the overall data used within that given method.

        //even though the increment() method is given a sleep function, the code will still move synchronisouly.
        try {
            increment();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        increment2();
        System.out.println(myNum);


    }


    public static synchronized void increment() throws InterruptedException {
        Thread.sleep(10000);
        for (int t = 0; t < 1000000; t++){
            myNum++;
        }
        System.out.println(myNum + " increment 1");
    }

    public static synchronized void increment2() {
        for (int t = 0; t < 1000000; t++){
            myNum++;
        }
        System.out.println(myNum + " Increment 2");
    }

}

