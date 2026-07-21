public class DemoGenericClass <T>{
    public <T> void display(T var) {
        System.out.printf("Gia tri cua bien la: " + var);

        Integer x = new Integer(5);
        DemoGenericClass<Integer> myObj1 = new DemoGenericClass<>();
        myObj1.display(x);

        String str = new String("abc");
        DemoGenericClass<String> myOBj2 = new DemoGenericClass<>();
        myOBj2.display(str);
    }
}
