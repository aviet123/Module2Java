package howtocreatlinkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList lol = new MyLinkedList(10);
        lol.addFirst(11);
        lol.addFirst(12);
        lol.addFirst(13);

        lol.add(4,9);
        lol.add(4,12);
        lol.printList();
    }
}
