package src.decorator.Toppings;

import src.decorator.Pizza;

public class Paneer extends ToppingsDecorator {
    private final Pizza pizza;

    public Paneer(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + "Paneer";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 60;
    }
}
