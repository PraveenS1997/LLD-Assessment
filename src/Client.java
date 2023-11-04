package src;

import src.Base.*;
import src.Toppings.*;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(pizza.getCost()); // should output 370
        System.out.println(pizza.getDescription()); // should output BBChicken + Tomato + Cheese + Paneer
    }
}
