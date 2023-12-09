package src.decorator.Base;

import src.decorator.Pizza;

public class Pepperoni implements Pizza {
    @Override
    public String getDescription() {
        return "Pepperoni";
    }

    @Override
    public int getCost() {
        return 180;
    }
}
