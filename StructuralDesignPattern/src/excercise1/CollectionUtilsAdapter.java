package excercise1;

import com.codegym.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations {
    List<Integer> list = new ArrayList<>();

    @Override
    public int findMax(Set<Integer> numbers) {
        CollectionUtils collectionUtils = new CollectionUtils();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(100);
        return collectionUtils.findMax(list);
    }
}
