import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n sinh vien muon khoi tao: ");
        int n = sc.nextInt();
        sc.nextLine();

        SinhVien[] ds = new SinhVien[n];

        System.out.println("Nhập cac thong tin cua sinh vien:");
        for (int i = 0; i < n; i++) {
            ds[i] = new SinhVien();

            System.out.println("Id sinh vien: ");
            ds[i].setId(sc.nextInt());
            sc.nextLine();

            System.out.println("Ho va ten sinh vien: ");
            ds[i].setName(sc.nextLine());

            System.out.println("Tuoi sinh vien: ");
            ds[i].setAge(sc.nextInt());
            sc.nextLine();

            System.out.println("Dia chi sinh vien: ");
            ds[i].setAddress(sc.nextLine());
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien " + (i + 1) + " co thong tin ca nhan la: ");
            ds[i].display();
        }
    }
}
