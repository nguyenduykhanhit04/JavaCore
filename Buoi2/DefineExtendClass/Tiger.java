package DefineExtendClass;

public class Tiger extends  Animal {
    private String name;

    public Tiger(String _name) {
        this.name = _name;
    }

    public void show() {
        System.out.println("Name = " + this.name);
    }
}
