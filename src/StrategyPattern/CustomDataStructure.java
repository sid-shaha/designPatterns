package StrategyPattern;

public abstract class CustomDataStructure {
    SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    abstract void sort();
}
