package src.Base;

import src.Pizza;

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
