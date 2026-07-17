public class Main {
    public static void main(String[] arg) {
        Person p1 = new Person();
        System.out.println("Thong tin Person 1:");
        p1.inputDetails("Khanh", "Thach Bich" , 22);
        p1.displayDetails();

        Person p2 = new Person();
        System.out.println("Thong tin Person 2:");
        p2.inputDetails("An", "Ha Noi", 20);
        p2.displayDetails();
    }
}
