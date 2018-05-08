package com.company;

import java.util.*;
/*
this is the main class where we check the code for the arraylist
 */


public class Main {

    public static void main(String[] args) {

	System.out.println("What do you want the size of the Array to be?"); //asks the user how large the want the arraylist to be

	Scanner myScanner = new Scanner(System.in); //gets the input

	ArrayList myArray = new ArrayList();
	ArrayList myArray1 = new ArrayList(myScanner.nextInt());


	//fills the two arrays with 15 random values at the same time
	for (int x =0; x<15; x++){
		Random random = new Random();
		int num = random.nextInt(25 - 1 + 1) + 1;
		System.out.println(num);

		myArray.add(num);
		myArray1.add(num);
	}

//add
	myArray.add(2, 15); //changed the second index to 15
	myArray1.add(2,15);//changed the second index to 15

//add
	System.out.println(myArray.get(2)); //called the second index of the array and got the value we entered earlier
	System.out.println(myArray1.get(2));//called the second index of the array and got the value we entered earlier



//size
	System.out.println(myArray.size()); //uses the size method to get the size of the arraylist we created
	System.out.println(myArray1.size());//uses the size method to get the size of the arraylist we created

//isEmpty
	System.out.println(myArray.isEmpty()); //Would return true if it is empty, and false if it is not empty
	System.out.println(myArray1.isEmpty()); //Would return true if it is empty, and false if it is not empty

//isIn
	System.out.println(myArray.isIn("my Object"));	//Would return true if it object is present in the arraylist, and false if it object is not in the arraylist
	System.out.println(myArray1.isIn("my Object")); //Would return true if it object is present in the arraylist, and false if it object is not in the arraylist

//find
	System.out.println(myArray.find(12));//returns the index of the object if it exists in the arraylist and would return MIN_VALUE for integer if it is not present in the arraylist
	System.out.println(myArray1.find(12)); //returns the index of the object if it exists in the arraylist and would return MIN_VALUE for integer if it is not present in the arraylist

//remove
	myArray.remove(6); //removes the object from the arraylist, if the object is not present, then prints "Object is not present in ArrayList"
	myArray1.remove(6); //removes the object from the arraylist, if the object is not present, then prints "Object is not present in ArrayList"


//view
		//prints the myObj array in myArray
		System.out.println("myArray printed out:");
		for (Object myObject : myArray.myObj){
			System.out.println(myObject);
		}


		System.out.println("myArray1 printed out:");
		//prints the myObj array in myArray1
		for (Object myObject : myArray1.myObj){
			System.out.println(myObject);
		}



	}

}
