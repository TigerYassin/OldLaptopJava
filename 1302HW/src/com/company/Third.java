package com.company;

class Other{
    public static int x = 0;
}

public class Third extends Thread{
    @Override
    public void run() {
        Other.x++;
        System.out.println(Other.x + " ");
    }

    public static void main(String[] args) {

        for (int i = 0; i < 1000000; i++){ //iterating a million times
            Thread t = new Third();
            t.start();
        }

    }

    }

