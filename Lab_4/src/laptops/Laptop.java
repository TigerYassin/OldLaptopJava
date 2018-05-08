package laptops;

import java.awt.*;

public class Laptop {

	/******************************************
	 * FIELDS
	 *******************************************/
	double price;
	double weight;
	double screenSize;

	/******************************************
	 * CONSTRUCTOR
	 *******************************************/
	public Laptop(){}
	public Laptop(double price){
		this.price = price;
	}
	public Laptop(double price, double weight){
		this.price = price;
		this.weight = weight;
	}
	public Laptop(double price, double weight, double screensize){
		this.price = price;
		this.weight = weight;
		this.screenSize = screensize;
	}
	
	/******************************************
	 * METHODS
	 *******************************************/
public void info(){
	System.out.println(price);
	System.out.println(weight);
	System.out.println(screenSize);
}
	
}
