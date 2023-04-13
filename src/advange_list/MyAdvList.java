package advange_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyAdvList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyAdvList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyAdvList(int capacity) {
        elements = new Object[capacity];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    private void add(E element, Object[] object) {
        if (size == object.length) {
            ensureCapa();
        }
        object[size++] = element;
    }
    public boolean add(E element){
        add(element,elements);
        return true;
    }
    public void add(int index, E element){
        if (size == elements.length) {
            ensureCapa();
        }
        if (index >= size){
            elements[size++] = element;
        }else {
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }
    public E remove(int index){
        E temp = (E) elements[index];
        if (size == 0){
            throw new RuntimeException("Array is empty!");
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return temp;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public int size(){
        return size;
    }
    @Override
    public MyAdvList<E> clone(){
        MyAdvList<E> result = new MyAdvList<E>(elements.length);
        for (int i = 0; i < size; i++) {
            result.add((E) elements[i]);
        }
        return result;
    }
    public int indexOf(E object){
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(object)){
                return i;
            }
        }
        return -1;
    }
    public boolean contains(E object){
        return indexOf(object) >= 0;
    }
    public void clear(){
        for (int curSize = size, i = 0 ; i < curSize ; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int getLength(){
        return elements.length;
    }

}
