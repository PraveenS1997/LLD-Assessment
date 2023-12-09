package src.decorator.Base;

import src.decorator.Pizza;

public class Farmhouse implements Pizza {
    @Override
    public String getDescription() {
        return "Farmhouse";
    }

    @Override
    public int getCost() {
        return 150;
    }
}
