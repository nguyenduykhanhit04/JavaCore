public abstract class Animal {
    protected String name;
    
    public Animal() {
        this.name = "Unknown";
    }
    
    public Animal(String name) {
        this.name = name;
    }
    
    public abstract void eat();
}
