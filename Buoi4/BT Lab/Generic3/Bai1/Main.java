class GenericClass<T> {

    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public void displayValue() {
        System.out.println("Gia tri: " + value);
    }

    // Generic Method
    public <E> void printArray(E[] array) {
        for (E item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        GenericClass<Integer> obj1 = new GenericClass<>(100);
        GenericClass<String> obj2 = new GenericClass<>("Java");
        GenericClass<Short> obj3 = new GenericClass<>((short)50);

        obj1.displayValue();
        obj2.displayValue();
        obj3.displayValue();

        Integer[] a = {1,2,3,4};
        String[] b = {"A","B","C"};
        Short[] c = {10,20,30};

        System.out.println("\nMang Integer:");
        obj1.printArray(a);

        System.out.println("Mang String:");
        obj2.printArray(b);

        System.out.println("Mang Short:");
        obj3.printArray(c);
    }
}