package FactoryPattern;

import DecoratorPattern.*;

public class PizzaFactory {
    BasePizza getPizza(String name){
        if(name == "MargheritaWithCheese"){
            return new ChesseTopping(new Margherita());
        }
        if(name == "VeggieWithMushroom"){
            return new MushroomTopping(new VeggiePizza());
        }
        return new Margherita();
    }
}
