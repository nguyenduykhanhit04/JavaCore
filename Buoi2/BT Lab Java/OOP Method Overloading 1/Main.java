import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap c: ");
        int c = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap so thuc x: ");
        double x = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap so thuc y: ");
        double y = sc.nextDouble();
        sc.nextLine();

        Calculator cal = new Calculator();

        System.out.println("Tong 2 so nguyen = " + cal.sum(a,b));
        System.out.println("Tong so thuc = " + cal.sum(x,y));
        System.out.println("Tong 3 so nguyen = " + cal.sum(a,b,c));

        System.out.println("Hieu 2 so nguyen = " + cal.minus(a,b));
        System.out.println("Hieu so thuc = " + cal.minus(x,y));
        System.out.println("Hieu 3 so nguyen = " + cal.minus(a,b,c));

        System.out.println("Tich 2 so nguyen = " + cal.multiple(a,b));
        System.out.println("Tich so thuc = " + cal.multiple(x,y));
        System.out.println("Tich 3 so nguyen = " + cal.multiple(a,b,c));

        System.out.println("Thuong 2 so nguyen = " + cal.devide(a,b));
        System.out.println("Thuong so thuc = " + cal.devide(x,y));
        System.out.println("Thuong 3 so nguyen = " + cal.devide(a,b,c));
    }
}
