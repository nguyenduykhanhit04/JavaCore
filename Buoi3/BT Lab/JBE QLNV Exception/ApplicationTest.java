import java.util.Scanner;

public class ApplicationTest {
    public static void main(String[] args) {
        Application app = new Application();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("====== QUAN LY NHAN VIEN ======");
            System.out.println("1. Nhap thong tin nhan vien");
            System.out.println("2. Sua ten cua mot nhan vien");
            System.out.println("3. Tinh luong trung binh");
            System.out.println("4. Tim nhan vien theo ten");
            System.out.println("5. Sap xep danh sach nhan vien theo ten");
            System.out.println("6. Hien thi danh sach tat ca nhan vien");
            System.out.println("7. Thoat chuong trinh");
            System.out.print("Chon chuc nang: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so hop le!");
                continue;
            }

            switch (choice) {
                case 1:
                    app.addNhanVien();
                    break;
                case 2:
                    app.updateName();
                    break;
                case 3:
                    app.calculateAverageSalary();
                    break;
                case 4:
                    app.findByName();
                    break;
                case 5:
                    app.sortByName();
                    break;
                case 6:
                    app.displayAll();
                    break;
                case 7:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 7);
        sc.close();
    }
}
