package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ArrayStructure ar = new ArrayStructure();
        ar.sort();
        ar.setSortingStrategy(new InsertionSort());
        ar.sort();

    }
}
