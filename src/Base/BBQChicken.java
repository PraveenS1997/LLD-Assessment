package src.Base;

import src.Pizza;

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
