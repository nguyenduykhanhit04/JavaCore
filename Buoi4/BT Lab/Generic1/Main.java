import java.util.Vector;

class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Gia tri: " + value);
    }
}

public class Main {
    public static <T extends Number> void printInfo(Vector<T> list) {

        System.out.println("Do dai mang: " + list.size());

        double sum = 0;

        for (T item : list) {
            sum += item.doubleValue();
        }

        System.out.println("Tong = " + sum);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        GenericClass<Integer> a = new GenericClass<>(100);
        GenericClass<Double> b = new GenericClass<>(25.5);
        GenericClass<String> c = new GenericClass<>("Hello Generic");

        a.display();
        b.display();
        c.display();

        System.out.println();

        Vector<Integer> intList = new Vector<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        Vector<Float> floatList = new Vector<>();
        floatList.add(1.5f);
        floatList.add(2.5f);
        floatList.add(3.5f);

        Vector<Double> doubleList = new Vector<>();
        doubleList.add(5.2);
        doubleList.add(8.3);
        doubleList.add(10.5);

        printInfo(intList);
        printInfo(floatList);
        printInfo(doubleList);
    }
}