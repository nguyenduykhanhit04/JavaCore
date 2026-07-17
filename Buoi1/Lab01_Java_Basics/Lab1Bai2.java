import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào giá trị a : ");
        int a = input.nextInt();

        int binhPhuong = a * a;
        int lapPhuong = a * a * a;

        System.out.println("Binh Phuong = " + binhPhuong);
        System.out.println("Lap Phuong = " + lapPhuong);
        
        input.close();
    }
}
