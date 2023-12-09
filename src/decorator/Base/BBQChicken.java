package src.decorator.Base;

import src.decorator.Pizza;

public class BBQChicken implements Pizza {
    @Override
    public String getDescription() {
        return "BBQChicken";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
