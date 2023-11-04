package src.Base;

import src.Pizza;

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
