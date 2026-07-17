import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào giá trị a : ");
        float a = input.nextFloat();
        System.out.println("Nhập vào giá trị b : ");
        float b = input.nextFloat();
        System.out.println("Nhập vào giá trị c : ");
        float c = input.nextFloat();

        float tong = a + b + c;
        System.out.println("Tong = " + tong);
        float trungBinhCong = tong / 3;
        System.out.println("Trung Binh Cong = " + trungBinhCong);
        input.close();
    }
}
