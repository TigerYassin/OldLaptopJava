package com.company;

import library.AnimatedRecursion;
import library.MyLib;

public class Main {

    /*
    todo
    write the rabbit jump with an algorithm
     */
    public static void main(String[] args){

        double startTime;
        double stopTime;
        int input = 1040;
		

		int[] arr = {1,2,3,4,5};
		int sum = MyLib.sum(arr);
		System.out.println("Sum: " + sum);

		

		startTime = System.currentTimeMillis();
		System.out.println("Iterative sum =  " + MyLib.sum_Iterative(input));
		stopTime = System.currentTimeMillis();
	    System.out.println("\t--> [" + (stopTime - startTime) + "]\n");
	    

	    startTime = System.currentTimeMillis();
		System.out.println("Recursive sum (tail) = " + MyLib.sum_Recursive1(input));
		stopTime = System.currentTimeMillis();
		System.out.println("\t--> [" + (stopTime - startTime) + "]\n");
	    
	    

	    startTime = System.currentTimeMillis();
		System.out.println("Recursive sum (head) = " + MyLib.sum_Recursive2(input, 0));
		stopTime = System.currentTimeMillis();
		System.out.println("\t--> [" + (stopTime - startTime) + "]\n");



		System.out.println("Recursive Factorial (tail) = " + MyLib.factorial_Recursive1(5));
        System.out.println("Recursive Factorial (Head) = " + MyLib.factorial_Recursive2(5,1));
        System.out.println("Itterative Factorial = " + MyLib.factorial_Iterative(5) + " \n");




        System.out.println("Fibonacci Recursive = " + MyLib.fibonacci_Recursive(9));
        System.out.println("Fibonacci Iterative = " + MyLib.fibonacci_Iterative(9) + "\n");


        System.out.println("RabbitJump Iterative = " + MyLib.rabbitJump_Iterative(5,8)); //Does not converge
        System.out.println("RabbitJump Convergence = " + MyLib.rabbitJump_convergence(5, 8));


        //Extra credit for the lab quiz
		AnimatedRecursion.init();
//		AnimatedRecursion.drawGoldenRatio_Recursive(8, 500, 500, 700); //Golden Ratio using a recursive method
		AnimatedRecursion.drawGoldenRatio_Iterative(8, 500, 500, 700); //Golden Ratio using an iterative while loop
    }



}