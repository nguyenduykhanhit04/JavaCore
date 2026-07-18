import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Application {
    private ArrayList<Nhanvien> list = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addNhanVien() {
        try {
            System.out.print("Nhap ID: ");
            String id = scanner.nextLine();
            if (id.trim().isEmpty()) throw new Exception("ID khong duoc de trong!");

            System.out.print("Nhap ten: ");
            String name = scanner.nextLine();
            if (name.trim().isEmpty()) throw new Exception("Ten khong duoc de trong!");

            System.out.print("Nhap luong: ");
            double salary = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Nhap tuoi: ");
            int age = Integer.parseInt(scanner.nextLine());
            if (age < 0) {
                throw new TonyException("Tuoi khong duoc nho hon 0!");
            }

            list.add(new Nhanvien(id, name, salary));
            System.out.println("Them nhan vien thanh cong!");
        } catch (TonyException e) {
            System.out.println("Loi: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Loi: Luong hoac tuoi phai la so!");
        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }

    public void updateName() {
        System.out.print("Nhap ID nhan vien can sua ten: ");
        String id = scanner.nextLine();
        for (Nhanvien nv : list) {
            if (nv.getId().equals(id)) {
                System.out.print("Nhap ten moi: ");
                String newName = scanner.nextLine();
                nv.setName(newName);
                System.out.println("Sua ten thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien voi ID: " + id);
    }

    public void calculateAverageSalary() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong.");
            return;
        }
        double total = 0;
        for (Nhanvien nv : list) {
            total += nv.getSalary();
        }
        System.out.println("Luong trung binh: " + (total / list.size()));
    }

    public void findByName() {
        System.out.print("Nhap ten can tim: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Nhanvien nv : list) {
            if (nv.getName().equalsIgnoreCase(name)) {
                System.out.println(nv);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay");
        }
    }

    public void sortByName() {
        Collections.sort(list, new Comparator<Nhanvien>() {
            @Override
            public int compare(Nhanvien nv1, Nhanvien nv2) {
                return nv1.getName().compareToIgnoreCase(nv2.getName());
            }
        });
        System.out.println("Da sap xep theo ten.");
    }

    public void displayAll() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong.");
            return;
        }
        System.out.println("STT\tID\tName\tSalary");
        double totalSalary = 0;
        for (int i = 0; i < list.size(); i++) {
            Nhanvien nv = list.get(i);
            System.out.println((i + 1) + "\t" + nv.getId() + "\t" + nv.getName() + "\t" + nv.getSalary());
            totalSalary += nv.getSalary();
        }
        System.out.println("Tong luong tra cho nhan vien: " + totalSalary);
    }
}
