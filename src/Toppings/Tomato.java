package src.Toppings;

import src.Pizza;

public class Tomato extends ToppingsDecorator {
    private final Pizza pizza;

    public Tomato(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + "Tomato";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }
}
