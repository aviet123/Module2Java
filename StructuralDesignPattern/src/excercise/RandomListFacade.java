package excercise;


import java.util.List;

public class RandomListFacade {
    private static final RandomListFacade INSTANCE = new RandomListFacade(new ListFilter(),new ListPrinter(), new RandomList());
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;

    private RandomListFacade(ListFilter listFilter, ListPrinter listPrinter, RandomList randomList) {
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
        this.randomList = randomList;
    }
    public static RandomListFacade getInstance(){
        return INSTANCE;
    }

    public void printRandomEvenList(int size, int max, int min, List<Integer> numbers){
        randomList.generateList(size, max, min);
        listFilter.filterOdd(randomList.generateList(size, min, max));
        listPrinter.printList(randomList.generateList(size, min, max));
    }
}
