package FactoryPattern;

import DecoratorPattern.BasePizza;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        BasePizza veggieWithMushroom = pizzaFactory.getPizza("VeggieWithMushroom");
        System.out.println(" Cost of veggie Pizza With Mushroom Topping  is "+veggieWithMushroom.cost());
        BasePizza margheritaWithCheese = pizzaFactory.getPizza("MargheritaWithCheese");
        System.out.println(" Cost of margherita Pizza With Cheese Topping  is "+margheritaWithCheese.cost());
    }
}
