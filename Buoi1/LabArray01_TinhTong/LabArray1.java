import java.util.Scanner;

public class LabArray1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo mảng
        int[] arr = new int[n];

        // Nhập mảng
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        // Tính tổng
        int sum = 0;

        // Tổng các số chia hết cho 3
        int sumDiv3 = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] % 3 == 0) {
                sumDiv3 += arr[i];
            }
        }

        // In kết quả
        System.out.println("Tổng các phần tử trong mảng = " + sum);
        System.out.println("Tổng các phần tử chia hết cho 3 = " + sumDiv3);

        scanner.close();
    }
}