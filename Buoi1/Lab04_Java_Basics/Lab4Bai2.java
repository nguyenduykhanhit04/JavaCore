import java.util.Scanner;

public class Lab4Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = input.nextInt();
        System.out.println("Nhập b: ");
        int b = input.nextInt();

        if ( b != 0) {
            int tong = a + b;
            int hieu = a - b;
            int tich = a * b;
            float thuong = (float) a / b;

            System.out.println("Tong: " + tong);
            System.out.println("Hieu: " + hieu);
            System.out.println("Tich: " + tich);
            System.out.println("Thuong: " + thuong);
        } else {
            System.out.println("Nhap sai voi dieu kien dua ra");
        }
        input.close();
    }
}
