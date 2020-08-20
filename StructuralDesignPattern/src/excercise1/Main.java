package excercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
       CollectionUtilsAdapter collectionUtilsAdapter = new CollectionUtilsAdapter();
       Client client = new Client(collectionUtilsAdapter);
       client.printMaxValue(setA);
    }
}
