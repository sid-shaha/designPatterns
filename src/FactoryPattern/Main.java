package FactoryPattern;

import DecoratorPattern.BasePizza;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        BasePizza veggiePizza = pizzaFactory.getPizza("VeggiePizza");
        System.out.println(" Cost of veggie Pizza is "+veggiePizza.cost());

        BasePizza margherita = pizzaFactory.getPizza("Margherita");
        System.out.println(" Cost of Margherita Pizza is "+margherita.cost());

        BasePizza margheritaWithCheese = pizzaFactory.getPizza("MargheritaWithCheese");
        System.out.println(" Cost of margherita Pizza With Cheese Topping  is "+margheritaWithCheese.cost());
    }
}
