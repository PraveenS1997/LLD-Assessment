package src.decorator;

import src.decorator.Base.*;
import src.Toppings.*;
import src.decorator.Toppings.Cheese;
import src.decorator.Toppings.Paneer;
import src.decorator.Toppings.Tomato;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(pizza.getCost()); // should output 370
        System.out.println(pizza.getDescription()); // should output BBChicken + Tomato + Cheese + Paneer
    }
}
