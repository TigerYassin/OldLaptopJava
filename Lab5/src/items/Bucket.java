package items;


import java.util.ArrayList;

public abstract class Bucket {


        private int numOfPieces;
        private double price;
        ArrayList<String> freeSides = new ArrayList<>();

        protected Bucket(){
            numOfPieces = 0;
            price = 0;
            freeSides = new ArrayList<>();
        }

        protected Bucket(int n){
            numOfPieces = n;
            price = 0;
            freeSides = new ArrayList<>();
        }

        public void printReceipt() {
            System.out.println("number of Wings: " + numOfPieces);
            System.out.println("Price: " + price);
        }

    public void setFreeSides(ArrayList<String> freeSides) {
        this.freeSides.addAll(freeSides);
    }
    public ArrayList<String> getFreeSides() {
        return freeSides;
    }

    public void setNumOfPieces(int num){
            numOfPieces = num;
    }

    public int getNumOfPieces() {
        return numOfPieces;
    }

    protected void setPrice(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    /*
	 *
	 * FIELDS: (MUST be 'private')
	 * 		1. Number of Pieces
	 * 		2. Price (per piece)
	 * 		3. Free side (if at all)
	 *
	 */


	/*
	 *
	 * CONSTRUCTORS: (MUST BE 'protected')
	 * 		1. Bucket()
	 * 		2. Bucket(int n)
	 *
	 */


	/*
	 *
	 * METHODS:
	 * 		1. Print the Receipt
	 * 		2. calculate the price (depends on the number of pieces)
	 * 		3. Setters for all fields. (setter for price MUST BE 'protected'.)
	 * 		4. Getters for all fields.
	 */

    }



