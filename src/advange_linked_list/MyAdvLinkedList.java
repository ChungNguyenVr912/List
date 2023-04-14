package advange_linked_list;

public class MyAdvLinkedList<E> implements Cloneable {
    private Node<E> head;
    private int numNodes;

    public MyAdvLinkedList() {
    }

    public void add(int index, E element) {
        Node<E> temp = head;
        Node<E> holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node<>(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        Node<E> temp = head;
        head = new Node<>(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        if (head == null){
            head = new Node<>(element);
            numNodes++;
        }else {
            Node<E> temp = head;
            for (int i = 0; i < numNodes - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node<>(element);
            numNodes++;
        }
    }

    public Node<E> remove(int index) {
        Node<E> holder;
        if (index == 0) {
            holder = head;
            head = head.next;
            numNodes--;
            return holder;
        }
        Node<E> temp = head;
        for (int i = 0; i < index - 1 && temp.next.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return holder;
    }

    public boolean remove(E object) {
        if ((head.data).equals(object)) {
            head = head.next;
            numNodes--;
            return true;
        }
        Node<E> temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            if ((temp.next.data).equals(object)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public E get(int index) {
        if (numNodes == 0) {
            return null;
        }
        Node<E> temp = head;
        for (int i = 0; i < index && temp.next != null; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public E getFirst() {
        return head.data;
    }

    public E getLast() {
        Node<E> temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public void setHead(E data){
        head.data = data;
    }

    public int size() {
        return numNodes;
    }



    public MyAdvLinkedList<E> clone() throws CloneNotSupportedException{
        MyAdvLinkedList<E> clone = (MyAdvLinkedList<E>)super.clone();
        clone.head = null;
        clone.numNodes = 0;
        for (Node<E> temp = head; temp != null; temp = temp.next) {
            clone.addLast(temp.data);
        }
        return clone;
    }

    private static class Node<E> {
        Node<E> next;
        E data;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }
    }
}
