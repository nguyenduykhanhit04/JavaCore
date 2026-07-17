package DefineExtendClass;

public class TestOOP {
    public static void main(String[] arg) {
        // khoi tao doi tuong
        Animal obj = new Animal();
        obj.displayDetails();

        // thiet lap gia tri cac thuoc tinh cua doi tuong
        obj.setId(1);
        obj.setWeight(20);

        // goi method cua doi tuong
        obj.displayDetails();

        Animal obj1 = new Animal(10, 50);
        obj1.displayDetails();

        Tiger t = new Tiger("White Tiger");
        t.show();
    }
}
