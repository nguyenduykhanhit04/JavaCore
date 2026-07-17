import java.util.Scanner;

public class Lab3Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập canh a: ");
        double a = input.nextDouble();
        System.out.println("Nhập canh b: ");
        double b = input.nextDouble();
        System.out.println("Nhập canh c: ");
        double c = input.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)) {

            double chuVi = a + b + c;

            double p = chuVi / 2;
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("Chu vi hình tam giác: " + chuVi);
            System.out.println("Diện tích hình tam giác: " + dienTich);

        } else {
            System.out.println("Ba số vừa nhập không phải là 3 cạnh của một tam giác");
        }
        input.close();
    }
}
