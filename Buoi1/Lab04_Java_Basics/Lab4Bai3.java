import java.util.Scanner;

public class Lab4Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một ký tự bất kỳ: ");
        char kyTu = scanner.next().charAt(0);

        if (kyTu == 'a' ) {
            System.out.println("Kết quả: Ký tự vừa nhập là chữ cái 'a'.");
        } else {
            System.out.println("Kết quả: Ký tự vừa nhập không phải là chữ cái 'a'.");
        }

        scanner.close();
    }
}
