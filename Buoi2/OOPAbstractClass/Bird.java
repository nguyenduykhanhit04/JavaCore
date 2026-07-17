package OOPAbstractClass;

public class Bird extends Animal {
    // override method duoc ke thua tu lop cha
    @Override
    public void go() {
        System.out.println("Go of bird");
    }
    public void run() {
        System.out.println("Run of bird");
    }
}
