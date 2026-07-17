public class Cat extends Animal {
    public static int maxAge = 20;
    
    public Cat() {
        super();
    }
    
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void eat() {
        System.out.println("Cat " + name + " is eating fish.");
    }
}
