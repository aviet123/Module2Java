package excercise;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public void printRandom(int size, int max, int min, List<Integer> numbers ){
        RandomListFacade.getInstance().printRandomEvenList(size,max,min,numbers);
    }
    public static void main(String[] args) {
        Client main = new Client();
        List<Integer> numbers = new ArrayList<>();
        main.printRandom(10,20,5,numbers);
    }
}
