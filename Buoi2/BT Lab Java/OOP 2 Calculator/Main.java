import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri a = ");
        double a = sc.nextDouble();
        System.out.println("Nhap gia tri b = ");
        double b = sc.nextDouble();

        Calculator c = new Calculator();
        System.out.println(a + "+" + b + "=" + c.add(a, b));
        System.out.println(a + "-" + b + "=" + c.minus(a, b));
        System.out.println(a + "/" + b + "=" + c.devide(a, b));
        System.out.println(a + "*" + b + "=" + c.multiple(a, b));
    }
}
