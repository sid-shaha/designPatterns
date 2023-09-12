package AbstractFactory;

public class Main {
    public static void main(String[] args){
        PizzaFactoryProducer pizzaFactoryProducer = new PizzaFactoryProducer();
        PizzaFactory vegPizzaFactory = pizzaFactoryProducer.getPizzaFactory("VEG");
        int VeggiePizzaCost = vegPizzaFactory.getPizza("veggie").getCost();
        System.out.println("Cost of Veggie Pizza is "+VeggiePizzaCost);

        int MushroomPizzaCost = vegPizzaFactory.getPizza("mushroom").getCost();
        System.out.println("Cost of mushroom Pizza is "+MushroomPizzaCost);


        PizzaFactory nonVegPizzaFactory = pizzaFactoryProducer.getPizzaFactory("NON-VEG");
        int ChickenPizzaCost = nonVegPizzaFactory.getPizza("ChickenPizza").getCost();
        System.out.println("Cost of Chicken Pizza is "+ChickenPizzaCost);
    }
}
