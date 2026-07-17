import java.util.Scanner;

public class LabArray3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextDouble();
        }

        if (n == 0) {
            System.out.println("Mảng rỗng.");
            scanner.close();
            return;
        }

        double max = arr[0];
        double min = arr[0];
        double sumDiv5 = 0;
        int countDiv5 = 0;
        double tich = 1;
        int countDiv3 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
            
            if (arr[i] % 5 == 0) {
                sumDiv5 += arr[i];
                countDiv5++;
            }
            
            tich *= arr[i];
            
            if (arr[i] % 3 == 0) {
                countDiv3++;
            }
        }

        int countMax = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                countMax++;
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Phần tử lớn nhất (Max): " + max);
        System.out.println("Phần tử nhỏ nhất (Min): " + min);
        
        if (countDiv5 > 0) {
            System.out.println("TBC các phần tử chia hết cho 5: " + (sumDiv5 / countDiv5));
        } else {
            System.out.println("Không có phần tử nào chia hết cho 5.");
        }

        System.out.println("Số phần tử có giá trị bằng Max (" + max + "): " + countMax);
        System.out.println("Tích của các phần tử trong mảng: " + tich);
        System.out.println("Số phần tử chia hết cho 3: " + countDiv3);

        scanner.close();
    }
}
