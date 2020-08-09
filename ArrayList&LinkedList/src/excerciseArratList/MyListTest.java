package excerciseArratList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        list.add(0,10);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,5);
        System.out.println(list.get(0));
        System.out.println(list.getSize());
        System.out.println(list.contains(3));
        list.clear();
        MyList<Integer> sec_list = (MyList<Integer>) list;

        System.out.println(list);
    }
}
