package DecoratorPattern;

public class MushroomTopping extends ToppingsDecorator{
    public MushroomTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return basePizza.cost() + 47;
    }
}
