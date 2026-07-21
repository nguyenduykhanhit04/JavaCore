import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInJava {
    public static void main(String[] args) {
        // Khai bao ArrayList
        ArrayList<String> listFruits = new ArrayList<>();
        listFruits.add("Orange");
        listFruits.add("Pineapple");
        listFruits.add("Apple");
        listFruits.add("Mango");
        listFruits.add("Strawberry");
        listFruits.add(1, "Watermelon");
        listFruits.remove(2);

        // Duyet qua ArrayList
        for (int i = 0; i < listFruits.size(); i++) {
            System.out.println(listFruits.get(i));
        }

        // Kiem tra xem mot phan tu co trong ArrayList hay khong
        System.out.println(listFruits.contains("Orange"));
        // Kiem tra xem ArrayList co rong hay khong
        System.out.println("is empty = " + listFruits.isEmpty());
        // Lay ve phan tu o index = 3
        System.out.println(listFruits.get(3));
        // Lay ve size cua ArrayList
        System.out.println("size = " + listFruits.size());
        // Lay ve chi so cua phan tu Apple
        System.out.println("Index of Apple = " + listFruits.indexOf("Apple"));

        // Duyet qua ArrayList su dung Iterator
        Iterator ite = listFruits.iterator();
        while (ite.hasNext()) {
            System.out.println("Element = " + ite.next());
        }

        // Duyet qua ArrayList su dung for each
        for (String s : listFruits) {
            System.out.println(s);
        }

        // Add mot ArrayList khac vao ArrayList hien tai
        ArrayList list2 = new ArrayList();
        list2.add("lemon");
        list2.add("peach");
        listFruits.addAll(list2);

        // Hien thi lai ArrayList
        System.out.println(listFruits);

        ArrayList<String> list = new ArrayList<String>();
        list.add("Tom hum bo la phomai");
        list.add("Cua be sot me");

        for (String s : list) {
            System.out.println(s);
        }

        list.set(1, "Muc ao xao can toi tay");
        list.remove(3);
        list.add(4, "Chao bao ngu");
        System.out.println("Size = " + list.size());
        System.out.println(list.contains("Banh my trung"));
        System.out.println(list.indexOf("Sup cua be"));
        System.out.println(list);
    }
}
