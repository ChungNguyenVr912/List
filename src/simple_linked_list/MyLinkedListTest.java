package simple_linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(13);
        ll.addFirst(13);
        ll.addFirst(15);
        ll.addFirst(13);
        ll.addFirst(13);
        ll.addFirst(13);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.add(11,99);
        ll.add(99,99);
        ll.printList();
    }
}
