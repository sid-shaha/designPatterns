package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza myPizza = new Margherita();
        System.out.println("My Pizza cost without toppings "+myPizza.cost());
        BasePizza withMushrooms = new MushroomTopping(myPizza);
        System.out.println("My Pizza cost with only mushrooms topping "+withMushrooms.cost());
        BasePizza withChesse = new ChesseTopping(myPizza);
        System.out.println("My Pizza cost with only cheese topping "+withChesse.cost());

        BasePizza withChesseMushroom = new ChesseTopping(new MushroomTopping(myPizza));
        System.out.println("My Pizza cost with cheese and mushroom toppings "+withChesseMushroom.cost());
    }
}