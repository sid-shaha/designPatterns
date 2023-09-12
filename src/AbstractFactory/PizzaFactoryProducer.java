package AbstractFactory;

public class PizzaFactoryProducer {
    PizzaFactory getPizzaFactory(String type){
        if(type == "VEG") return new VegPizzaFactory();
        if(type == "NON-VEG") return new NonVegPizzaFactory();
        return new VegPizzaFactory();
    }
}
