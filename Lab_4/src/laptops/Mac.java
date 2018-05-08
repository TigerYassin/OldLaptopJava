package laptops;

public class Mac extends Laptop {
	
	/******************************************
	 * FIELDS
	 *******************************************/
	/*
	 * Add the fields here
	 * (For Macbooks, we need a field to indicate the model
	 * whether this model is a "-", "pro", or "air".)
	 */

	String model;
	
	
	/******************************************
	 * CONSTRUCTOR
	 *******************************************/
	/*
	 * Add the constructors here
	 * 
	 */
	public Mac(){}

	public Mac(String model) {
		this.model = model;
	}

	public Mac(double price, String model) {
		super(price);
		this.model = model;
	}

	public Mac(double price, double weight, String model) {
		super(price, weight);
		this.model = model;
	}

	public Mac(double price, double weight, double screensize, String model) {
		super(price, weight, screensize);
		this.model = model;
	}


	/******************************************
	 * METHODS
	 *******************************************/
	/*
	 * Add a method to print all the information (fields)
	 * 
	 */

	public void info() {
		super.info();
		System.out.println(model);
	}




}
