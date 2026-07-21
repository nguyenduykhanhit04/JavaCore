import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo ra một ArrayList có sử dụng wildcard để chỉ cho phép chứa các đối tượng của lớp SinhVien
        List<? super SinhVien> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thong tin 5 sinh vien:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Sinh vien " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());

            list.add(new SinhVien(id, name, age));
        }

        System.out.println("\nDanh sach cac sinh vien co tuoi > 20:");
        int count = 0;
        for (Object obj : list) {
            if (obj instanceof SinhVien) {
                SinhVien sv = (SinhVien) obj;
                if (sv.getAge() > 20) {
                    System.out.println(sv);
                    count++;
                }
            }
        }
        System.out.println("Tong so sinh vien co tuoi > 20: " + count);
        sc.close();
    }
}
