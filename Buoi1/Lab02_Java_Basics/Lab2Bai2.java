import java.util.Scanner;

public class Lab2Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào giá trị a: ");
        float a = input.nextFloat();
        System.out.println("Nhập vào giá trị b: ");
        float b = input.nextFloat();
        System.out.println("Nhập vào giá trị c: ");
        float c = input.nextFloat();

        float max = Math.max(a, Math.max(b, c));

        System.out.println("So lon nhat trong cac so nhap la: " + max);
        input.close();
    }
}
