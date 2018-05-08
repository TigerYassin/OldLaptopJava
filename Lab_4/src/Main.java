import laptops.*;

/**
 * This is the main class for your fourth lab homework.
 * 
 * Friday 04-Feb-2018
 * @author Azim Ahmadzadeh - https://grid.cs.gsu.edu/~aahmadzadeh1/
 */
public class Main {
	
	/*
	 * ------------------------------------------------------------------------
	 * Task: Follow the steps described below, and gradually uncomment the
	 * snippets of code below the CHECK YOUR CODE tag, one by one, to check
	 * your implementation of classes.
	 * ------------------------------------------------------------------------
	 * 0. Make sure you maintain the project architecture as it is:
	 * 		(default package) --> Main.java
	 * 		laptop			  --> Laptop.java, Mac.java, Lenovo.java
	 * 
	 * 1. Start with the class 'Laptop' and complete it.
	 * 
	 * 2. Create another class, 'Mac'\
	 * 		2.1. This class inherits everything from 'Laptop'. (It extends 'Laptop'.)
	 * 		2.2. This class should have one additional field; for Macbooks, we need
	 * 			 a field to indicate the model, whether it is a "-", "pro", or "air".
	 * 		2.3. Make sure all constructors and methods work properly with the new
	 * 			 field as well. 
	 * 
	 * 3. Create yet another class, 'Lenovo', also extending 'Laptop'.
	 * 		3.1. This clss inherits everything from 'Laptop'. (It extends 'Laptop'.)
	 * 		3.2. This class should have one additional field; for Lenovo laptops we
	 * 			 need a field which indicates which operating system this device comes
	 * 			 with. It could be Windows, Linux, Chrome, or None.
	 * 		3.3. Make sure all the constructors and methods work properly with the new
	 * 			 field as well.
	 * 
	 * 4. Make sure onc cannot create an object of type 'Laptop'. Only 'Mac' or 'Lenovo'
	 *    objects can be created. 
	 */


	static double myMacPrice = 1800;
	static double myMacWeight = 2.03;
	static double myMacScreen = 12.0;
	static String myMacModel = "air";

	static double myLenovoPrice = 1650;
	static double myLenovoWeight = 2.45;
	static double myLenovoScreen = 12.4;
	static String withOS = "Linux";


	//+++++++++++++++++++++++ CHECK YOUR CODE +++++++++++++++++++++++++


	public static void main(String[] args) {
		Laptop myLaptop = new Mac();
		myLaptop.info();



	myLaptop = new Mac(myMacPrice, myMacWeight, myMacScreen, myMacModel);
	myLaptop.info();

	

	Laptop myLenovoLaptop = new Lenovo();
	myLenovoLaptop.info();

	

	myLenovoLaptop = new Lenovo(myLenovoPrice, myLenovoWeight, myLenovoScreen, withOS);
	myLenovoLaptop.info();

	}

}
