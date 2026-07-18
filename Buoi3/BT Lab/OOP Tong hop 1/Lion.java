public class Lion extends Animal{
    private String gender;
    public Lion(String name, String gender) {
        super(name);
        this.gender = gender;
    }
    @Override
    public void eat() {
        System.out.println(name + "an");
    }

    @Override
    public void go() {
        System.out.println(name + "di");
    }
}
