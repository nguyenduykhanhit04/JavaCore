public class Lion extends Animal {
    public Lion() {
        super();
    }
    
    public Lion(String name) {
        super(name);
    }
    
    @Override
    public void eat() {
        System.out.println("Lion " + name + " is eating meat.");
    }
    
    public void run() {
        System.out.println("Lion " + name + " is running.");
    }
    
    public void run(int speed) {
        System.out.println("Lion " + name + " is running at " + speed + " km/h.");
    }
}
