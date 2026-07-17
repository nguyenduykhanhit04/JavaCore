import java.util.Scanner;

public class Lab4Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = input.nextDouble();
        System.out.println("Nhập b: ");
        double b = input.nextDouble();
        System.out.println("Nhập c: ");
        double c = input.nextDouble();

        double tong = a + b + c;
        System.out.println("Tong = " + tong);
        input.close();
    }
}
