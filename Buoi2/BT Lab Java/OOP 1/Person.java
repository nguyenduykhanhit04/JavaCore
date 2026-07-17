public class Person {

    private String name;
    private String address;
    private int age;

    public void inputDetails(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name = " + name + ", Address = " + address + ", Age = " + age);
    }
}
