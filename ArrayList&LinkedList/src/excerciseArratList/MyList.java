package excerciseArratList;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];

    }

    public MyList(int capacity) {
        this.size = capacity;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        ensureCapacity();
        for (int i = size-1; i >index ; i--) {
            elements[i] = elements[i+1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        checkIndex(index);
        E element = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int getSize() {
        return size;
    }

//    public MyList clone() {
//
//        MyList list = new MyList();
//
//        return elements1;
//
//    }
    public E get(int index){
        checkIndex(index);
        return elements[index];
    }

    public boolean contains(E o) {
        for (int i = 0; i < getSize(); i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e){
        for (int i = 0; i < elements.length; i++)
            if (e.equals(elements[i]))
            return i;
            return -1;
    }
    public boolean add(E e){
        if (size == DEFAULT_CAPACITY)
            return false;
        else add(size,e);
        return true;
    }
    public void clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }
}
