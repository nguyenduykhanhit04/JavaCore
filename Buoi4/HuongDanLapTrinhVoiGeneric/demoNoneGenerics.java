import java.util.ArrayList;

public class demoNoneGenerics {
    public static void main (String[] args) {
        ArrayList listFruits = new ArrayList();
        listFruits.add("Orange");
        listFruits.add("Lemon");

        // phan tu thu 3 co kieu du lieu la Integer
        listFruits.add(5);

        // lay ra phan tu thu nhat
        String value1 = (String)listFruits.get(0);
        System.out.println("Value 1 = " + value1);

        // lay ra phan tu thu 3, ep kieu sai
        String value3 = (String)listFruits.get(2);
        System.out.printf("value 3 = " + value3);
    }
}
