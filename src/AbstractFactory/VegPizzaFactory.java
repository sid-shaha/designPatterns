package AbstractFactory;

public class VegPizzaFactory implements PizzaFactory{
    @Override
    public Pizza getPizza(String name) {
        if(name == "veggie") return new VeggiePizza();
        if(name == "mushroom") return new MushroomPizza();
        return new VeggiePizza();
    }
}
