public final class Dog extends Animal {
    public Dog() {
        super();
    }
    
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void eat() {
        System.out.println("Dog " + name + " is eating bone.");
    }
}
