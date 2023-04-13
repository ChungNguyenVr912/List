package advange_list;

import java.util.Iterator;

public class MyAdvListTest {
    public static void main(String[] args) {
        MyAdvList<String> myAdvList = new MyAdvList<>();
        myAdvList.add("1");
        myAdvList.add("2");
        myAdvList.add("3");
        myAdvList.add("4");
        myAdvList.add("5");
        myAdvList.add("6");
        myAdvList.add(2,"99");
        for (int i = 0; i < myAdvList.size(); i++) {
            System.out.println(myAdvList.get(i));
        }
        System.out.println("Size: "  + myAdvList.size());
        String removed = myAdvList.remove(2);
        System.out.println("Removed " + removed);
        System.out.println("New size: " + myAdvList.size());
        for (int i = 0; i < myAdvList.size(); i++) {
            System.out.println(myAdvList.get(i));
        }
        MyAdvList<String> myAdvList1 = myAdvList.clone();
        myAdvList1.add("7");
        System.out.println("Clone and add '7': ");
        for (int i = 0; i < myAdvList1.size(); i++) {
            System.out.println(myAdvList1.get(i));
        }
        System.out.print("index of '2': ");
        System.out.println(myAdvList1.indexOf("2"));
        System.out.println("Is myAdvList1 contain '2'");
        if (myAdvList.contains("2")){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
