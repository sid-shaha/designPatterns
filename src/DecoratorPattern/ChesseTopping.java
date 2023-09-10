package DecoratorPattern;

public class ChesseTopping extends ToppingsDecorator{
    public ChesseTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return basePizza.cost()+73;
    }
}
