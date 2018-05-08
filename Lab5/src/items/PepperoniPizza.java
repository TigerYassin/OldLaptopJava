package items;

import java.util.LinkedList;
import java.util.List;

public class PepperoniPizza extends Pizza {

    public enum PepperoniExtraToppings{
        CHERRY_TOMATO, PARMESAN_CHEESE
    }

        final static double PEPPERONI_BASE_PRICE = 10.99;
    final static List<String> PEPPERONI_TOPPINGS = new LinkedList<>();




    public PepperoniPizza() {
        super();
        setBasePrice(PEPPERONI_BASE_PRICE);
        setToppings(PEPPERONI_TOPPINGS);
    }

    public PepperoniPizza(PizzaSize pSize) {
        super(pSize);
        setBasePrice(PEPPERONI_BASE_PRICE);
        setToppings(PEPPERONI_TOPPINGS);
    }
}
