package FactoryPattern;

import DecoratorPattern.*;

public class PizzaFactory {
    BasePizza getPizza(String name){
        if(name.equals("Margherita")){
            return new Margherita();
        }
        if(name.equals("VeggiePizza")) {
            return new VeggiePizza();
        }
        if(name.equals("MargheritaWithCheese")){
            return new ChesseTopping(new Margherita());
        }
        if(name.equals("VeggieWithMushroom")){
            return new MushroomTopping(new VeggiePizza());
        }
        return new Margherita();
    }
}
