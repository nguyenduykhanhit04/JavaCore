public class Main {

    // Generic Method
    public static <T> void displayArray(T[] array) {

        for (T item : array) {
            System.out.print(item + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Mảng Integer
        Integer[] intArray = {10, 20, 30, 40};

        // Mảng Double
        Double[] doubleArray = {1.5, 2.6, 3.7, 4.8};

        // Mảng String
        String[] stringArray = {"Java", "Generic", "Method"};

        System.out.println("Integer Array:");
        displayArray(intArray);

        System.out.println();

        System.out.println("Double Array:");
        displayArray(doubleArray);

        System.out.println();

        System.out.println("String Array:");
        displayArray(stringArray);
    }
}