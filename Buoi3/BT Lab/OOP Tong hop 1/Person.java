public class Person extends Animal {
    private int age;
    private String address;
    public Person(String name, int age, String address) {
        super(name);
        this.age = age;
        this.address = address;
    }
    @Override
    public void go() {
        System.out.printf(name + "di");
    }

    @Override
    public void eat() {
        System.out.println(name + "an");
    }

    public void work() {
        System.out.println(name + "dang lam viec");
    }

    public void work(int hour) {
        System.out.println(name + "dang lam viec" + hour + "gio");
    }

}
