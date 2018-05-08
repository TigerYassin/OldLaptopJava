package items;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ChickenWings extends Bucket {

    public enum WingSauce {
        Sriracha, Teriyaki
    }

    int numbOfSauce;
    public void setMySauce(WingSauce mySauce) {
        this.mySauce = mySauce;
    }

    public void setMyArray(ArrayList<String> myArray) {
        this.myArray.addAll(myArray);
    }

    public WingSauce getMySauce() {
        return mySauce;
    }

    public ArrayList<String> getMyArray() {
        return myArray;
    }

    private WingSauce mySauce;
    final static double WING_BASE_PRICE = 1.59;
    ArrayList<String> myArray = new ArrayList<>();

    public ChickenWings(){
        super();
    }
    public ChickenWings(int n){
        super(n);
        setPrice(WING_BASE_PRICE * n);
    }

    public ChickenWings(int n, WingSauce s){
        super(n);
        setPrice(WING_BASE_PRICE * n + 0.5 * numbOfSauce);
        mySauce = s;
    }


    public void printReceipt() {
        System.out.println("number of Wings: " + getNumOfPieces());
        System.out.println("Price: " + getPrice());
        System.out.println("You got Sauce type: " + mySauce);


    }
    /*
	 * 	Fields: (in addition to the parent class)
	 * 		1. WING_BASE_PRICE
	 * 		2. LIST_OF_FREE_SIDES (This is similar to the list of extra topping in 'PepperoniPizza' example.)
	 * 		2. Sauce (Each sauce MUST add $0.5 to the final price.
	 *
	 */

	/*
	 *
	 * CONSTRUCTORS: (MUST call its parent's constructor)
	 * 		1. ChickenWings()
	 * 		2. ChickenWings(int n)
	 * 		3. ChickenWings(int n, Sauce s)
	 *
	 */

	/*
	 *
	 * METHODS:
	 * 		1. Print the Receipt (if needed, it MUST override the parent's method.)
	 * 		2. calculate the price (depends on the number of pieces and the sauce)
	 * 		3. Setters for any extra field. (Only if necessary)
	 * 		4. Getters for any extra field. (Only if necessary)
	 */


}
