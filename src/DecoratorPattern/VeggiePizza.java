package DecoratorPattern;

public class VeggiePizza implements BasePizza{
    @Override
    public int cost() {
        return 200;
    }
}
