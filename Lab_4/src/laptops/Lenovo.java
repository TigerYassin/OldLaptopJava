package laptops;

public class Lenovo extends Laptop {

	/******************************************
	 * FIELDS
	 *******************************************/
	/*
	 * Add the fields here
	 * (For Lenovo laptops we need a field which indicates
	 * which operating system this device comes with.)
	 */

	String operatingSystem;

	
	
	/******************************************
	 * CONSTRUCTOR
	 *******************************************/

	public Lenovo(){}

	public Lenovo(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public Lenovo(double price, String operatingSystem) {
		super(price);
		this.operatingSystem = operatingSystem;
	}

	public Lenovo(double price, double weight, String operatingSystem) {
		super(price, weight);
		this.operatingSystem = operatingSystem;
	}

	public Lenovo(double price, double weight, double screensize, String operatingSystem) {
		super(price, weight, screensize);
		this.operatingSystem = operatingSystem;
	}

	/******************************************
	 * METHODS
	 *******************************************/
	public void info() {
		super.info();
		System.out.println(operatingSystem);
	}
}
