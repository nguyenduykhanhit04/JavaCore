import java.util.Scanner;

public class JavaExcption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap vao 1 so: ");
            String s = sc.nextLine();
            int n = Integer.parseInt(s);

            System.out.println("Nhap vao mot string");
            String ss = sc.nextLine();

            System.out.println("Nhap vao mot mang cac string vao ban phim");
            int size = Integer.parseInt(sc.nextLine());

            String[] arr = new String[size];
            for (int i = 0; i < size - 1; i++) {
                System.out.println("Arr[ "+ i + " ] = ");
                arr[i] = sc.nextLine();
            }

            System.out.println("Nhao so chia: ");
            int divider = Integer.parseInt(sc.nextLine());
            int result = n / divider;
            System.out.println("Ket qua la: " + result);

            System.out.println(ss.length());

            String str = null;
            System.out.println("String: " + str);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Chuong trinh ket thuc");
        }

    }
}
