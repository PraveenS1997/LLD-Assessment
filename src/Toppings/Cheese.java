package src.Toppings;

import src.Pizza;

public class Cheese extends ToppingsDecorator {
    private final Pizza pizza;

    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + "Cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 80;
    }
}
