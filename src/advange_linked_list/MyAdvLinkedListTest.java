package advange_linked_list;

public class MyAdvLinkedListTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyAdvLinkedList<String> list1 = new MyAdvLinkedList<>();
        MyAdvLinkedList<String> list2 ;
        list1.addFirst("9");
        list1.addFirst("8");
        list1.addFirst("7");
        list1.addFirst("6");
        list1.addFirst("5");
        list1.addFirst("4");
        list1.addFirst("3");
        list1.addFirst("2");
        list1.addFirst("1");
        list1.addLast("10");
        list1.add(4, "99");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + "\t");
        }
        System.out.println("\nAfter remove '99'");
        list1.remove(4);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + "\t");
        }
        list1.remove(8);
        System.out.println("\nRemove last ele:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + "\t");
        }
        System.out.println("\n Remove out of bound index:");
        list1.remove(99);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + "\t");
        }
        System.out.println("\n list2 = clone list1:");
        list2 = list1.clone();
        System.out.println("\n list1 remove '7':");
        list1.setHead("99");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + "\t");
        }

        System.out.println("\n list2:");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + "\t");
        }

    }
}
