import java.util.Scanner;

public class Lab3Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chieu rong: ");
        float a = input.nextFloat();
        System.out.println("Nhập chieu dai: ");
        float b = input.nextFloat();

        if ( a > 0 && b > 0) {
        float chuViHinhChuNhat = ( a + b ) * 2;
        float dienTichHinhChuNhat = a * b;
        System.out.println("chu vi hinh chu nhat la: " + chuViHinhChuNhat);
        System.out.println("dien tich hinh chu nhat la: " + dienTichHinhChuNhat);
        } else {
            System.out.println("Nhap cho dung chieu dai va chieu rong");
        }
        input.close();
    }
}
