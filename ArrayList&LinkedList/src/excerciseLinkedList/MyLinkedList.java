package excerciseLinkedList;

import excerciseArratList.MyList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(){

    }
    private class Node {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return this.data;
        }
    }
    public void ensureCapacity(int minCapacity){
        int newSize = minCapacity *2;
        numNodes = newSize;
    }
    public void addFirst(E element){
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }
    public void add (int index, E element) {
        if (head == null) addFirst(element);
        else {
            Node temp = head;
            Node tail;

            for (int i = 0; i < index - 1; i++) {
                if (temp.next != null)
                    temp = temp.next;

            }
            tail = temp.next;
            temp.next = new Node(element);
            temp.next.next = tail;
            numNodes++;
        }
    }
    public void addLast(E element){
        if (head == null){
            addFirst(element);
        }else
        {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(element);
        }
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public int getSize(){
        return numNodes;
    }

    public E remove(int index){
        if (numNodes == 0) return null;

        Node previous = head;

        for (int i = 0; i < index-1; i++) {
            previous = previous.next;
        }
        Node current = previous.next;
        previous.next = current.next;
        numNodes--;
        return current.data;
    }
    public boolean remove(E element){
        if (numNodes == 0){
            return false;
        }else {
            Node current = head ;
            while (current != null){
                if (element == current.data){
                    current.next = null;
                    numNodes--;
                    return true;
                }
                else
                return false;
            }
            return false;
        }
    }
}
