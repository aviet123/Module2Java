package excerciseLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add(0,"4");
        linkedList.add(1,"5");
        linkedList.add(2,"6");
        linkedList.add(3,"7");
        linkedList.remove("7");
        linkedList.printList();
    }
}
