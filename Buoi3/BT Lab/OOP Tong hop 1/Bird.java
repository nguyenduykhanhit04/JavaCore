public class Bird extends Animal{
    private int weight;
    public Bird(String name, int weight) {
        super(name);
        this.weight = weight;
    }
    @Override
    public void eat() {
        System.out.println("Chim an");
    }
    @Override
    public void go() {
        System.out.println("Chim di");
    }

}
