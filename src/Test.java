import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("a");
        list1.add("a");
        list1.add("a");
        list1.add("a");
        list1.add("a");
        LinkedList<String> list2 = (LinkedList<String>) list1.clone();
        list1.forEach(element -> System.out.print(element));
        System.out.println();
        list2.forEach(element -> System.out.print(element));
        System.out.println("\nchange list 1");
        list1.set(2,"b");
        list1.forEach(element -> System.out.print(element));
        System.out.println();
        list2.forEach(element -> System.out.print(element));
    }
}
