import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();

        System.out.println("Nhap so gio lam viec: ");
        int sogio = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap tien thuong: ");
        int thuong = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap tien phat: ");
        int phat = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap he so chuc vu (vd: 1.5): ");
        double heso = Double.parseDouble(sc.nextLine());

        System.out.println("--- Ket qua tinh luong ---");
        System.out.println("1. Luong co ban: " + nv.tinhluong(sogio));
        System.out.println("2. Luong + thuong: " + nv.tinhluong(sogio, thuong));
        System.out.println("3. Luong + thuong - phat: " + nv.tinhluong(sogio, thuong, phat));
        System.out.println("4. Luong thuc lanh (co he so): " + nv.tinhluong(sogio, thuong, phat, heso));
        
        sc.close();
    }
}
