package StrategyPattern;

public class ArrayStructure extends CustomDataStructure{
    ArrayStructure() {
        SortingStrategy sortingStrategy1 = new BubbleSort();
        setSortingStrategy(sortingStrategy1);
    }

    @Override
    public void sort() {
        sortingStrategy.sort();
    }
}
