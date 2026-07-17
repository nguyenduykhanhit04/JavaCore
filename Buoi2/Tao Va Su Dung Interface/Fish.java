public class Fish implements Animal, DongVatAnThit{
    @Override
    public void go() {
        System.out.println("Go() in Fish");
    }
    @Override
    public void xexac() {
        System.out.println("Xexac() in Fish");
    }
}
