package com.company;

import items.Bucket;
import items.ChickenWings;
import items.PepperoniPizza;
import items.PepperoniPizza.PepperoniExtraToppings;
import items.Pizza;
import items.Pizza.PizzaSize;

import java.util.ArrayList;

/**
 *
 * Friday 09-Feb-2018
 *
 * This project contains both what we practiced and what
 * is to be completed as your homework.
 *
 *
 * @author Azim Ahmadzadeh - https://grid.cs.gsu.edu/~aahmadzadeh1/
 *
 */


/**
 * This project is implemented to walk the students through
 * the idea of inheritance, with a short stop on important
 * topics such as polymorphism and encapsulation.
 *
 *
 */
public class Main {

    public static void main(String[] args) {

        PizzaSize pSize = PizzaSize.XLARGE;
        Pizza myPizza = new PepperoniPizza(pSize);

        myPizza.addExtraToppings(PepperoniExtraToppings.CHERRY_TOMATO.toString());
        myPizza.addExtraToppings(PepperoniExtraToppings.PARMESAN_CHEESE.toString());

        myPizza.printReceipt();


        Bucket myBucket = new ChickenWings(15);
        myBucket.printReceipt();

       ChickenWings myChicken = new ChickenWings(15);
       myChicken.setMySauce(ChickenWings.WingSauce.Sriracha);
       myChicken.printReceipt();


       ChickenWings New1 = new ChickenWings(20, ChickenWings.WingSauce.Teriyaki);
        ArrayList<String> other = new ArrayList<>(){{
            add("Fries");
            add("Tomatoes");
            add("Drink");
            add("Pickles");
        }};

       New1.setMyArray(other);
       New1.printReceipt();


    }

}


/* UNCOMMENT FOR YOUR HOMEWORK */
/*
 * Scenario I:
 *  1. Create a polymorphic object of type ChickenWings
 *  2. Add 15 wings to it
 *  3. Print receipt
 *  4. Add 1 sauce to it
 *  5. Print receipt (again)
 *  
 */


/*
 * Scenario II:
 *  1. Create a polymorphic object of type ChickenWings
 *  2. Add 20 wings to it
 *  3. Print receipt
 *  4. Add a free item (e.g., onion rings)
 *  5. Add 3 sauce
 *  5. Print receipt (again)
 *  
 */