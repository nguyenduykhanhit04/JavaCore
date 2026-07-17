import java.util.Scanner;

public class Lab2Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên : ");
        int a = input.nextInt();

        if ( a % 2 == 0 ) {
            System.out.println(a + " là Số chẵn");
        } else {
            System.out.println(a + " là Số lẻ");
        }
        
        input.close();
    }
}
