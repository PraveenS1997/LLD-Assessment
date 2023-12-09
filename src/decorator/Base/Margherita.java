package src.decorator.Base;

import src.decorator.Pizza;

public class Margherita implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
