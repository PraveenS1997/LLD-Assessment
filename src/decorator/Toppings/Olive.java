package src.decorator.Toppings;

import src.decorator.Pizza;

public class Olive extends ToppingsDecorator {
    private final Pizza pizza;

    public Olive(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + "Olive";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }
}
