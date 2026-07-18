import java.io.FileOutputStream;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileOutputStream out = new FileOutputStream("Data.txt");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Employee " + i);

                System.out.println("Id: ");
                String id = sc.nextLine();

                System.out.println("Name: ");
                String name = sc.nextLine();

                System.out.println("Address: ");
                String address = sc.nextLine();

                System.out.println("PhoneNumber: ");
                String PhoneNumber = sc.nextLine();

                String record = id + "\t"
                        + name + "\t"
                        + address + "\t"
                        + PhoneNumber + "\n";

                out.write(record.getBytes());
            }

            out.close();
            System.out.println("Da luu du lieu thanh cong");

        } catch (Exception e) {
            System.out.println("Loi: " + e);
        }
        sc.close();
        System.out.println("Chuong trinh ket thuc");
    }
}
