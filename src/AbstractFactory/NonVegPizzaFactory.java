package AbstractFactory;

public class NonVegPizzaFactory implements PizzaFactory{
    @Override
    public Pizza getPizza(String name) {
        if(name == "NonVegPizza") return new NonVegPizza();
        if(name == "ChickenPizza") return new ChickenPizza();
        return new NonVegPizza();
    }
}
