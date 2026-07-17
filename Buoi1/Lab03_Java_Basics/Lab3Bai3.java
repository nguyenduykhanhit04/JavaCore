import java.util.Scanner;

public class Lab3Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn (r): ");
        double r = scanner.nextDouble();

        if (r > 0) {
            double chuVi = 2 * Math.PI * r;
            double dienTich = Math.PI * Math.pow(r, 2);

            System.out.println("Chu vi hình tròn: " + chuVi);
            System.out.println("Diện tích hình tròn: " + dienTich);
        } else {
            System.out.println("Lỗi: Bán kính phải lớn hơn 0!");
        }

        scanner.close();
    }
}
