package AbstractFactory;

public class NonVegPizza implements Pizza{
    @Override
    public int getCost() {
        return 250;
    }
}
