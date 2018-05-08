package items;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * This class is able to take care of the general requirements
 * of any object with a reference to 'Pizza'. The specific details
 * of each type of pizza is left for their classes.
 *
 * @author Azim Ahmadzadeh - https://grid.cs.gsu.edu/~aahmadzadeh1/
 *
 */
public abstract class Pizza {

    public enum PizzaSize {
        MEDIUM, LARGE, XLARGE
    }

    private PizzaSize pSize;
    private double basePrice;
    private List<String> toppings;

    protected Pizza() {

        this.pSize = PizzaSize.MEDIUM;
        this.basePrice = 0.0;
        this.toppings = new LinkedList<String>();
    }

    protected Pizza(PizzaSize pSize) {

        this.pSize = pSize;
        this.basePrice = 0.0;
        this.toppings = new LinkedList<String>();
    }


    public void addExtraToppings(String extraToppings){
        this.toppings.add(extraToppings);
        double currentPrice = this.getBasePrice();
        currentPrice += 1.0;
        this.setBasePrice(currentPrice);
    }

    public void printReceipt(){

        System.out.println("TYPE:\t\t" + this.getClass().getSimpleName());
        System.out.println("SIZE:\t\t" + this.getPizzaSize().toString());
        System.out.println("TOPPINGS:\t" + Arrays.toString(this.toppings.toArray()));
        System.out.println("PRICE:\t" + this.getBasePrice());

    }


    public PizzaSize getPizzaSize() {
        return pSize;
    }

    public void setPizzaSize(PizzaSize pSize) {
        this.pSize = pSize;
    }

    public List<String> getToppings() {
        return toppings;
    }

    protected void setToppings(List<String> toppings) {
        this.toppings.addAll(toppings);
    }

    public double getBasePrice() {
        return basePrice;
    }

    protected void setBasePrice(double price){
        this.basePrice = price;
    }
}