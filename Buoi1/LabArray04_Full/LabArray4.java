import java.util.Scanner;

public class LabArray4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        if (n == 0) {
            System.out.println("Mảng rỗng.");
            scanner.close();
            return;
        }

        int countChan = 0;
        int sumChan = 0;
        int max = arr[0];
        int min = arr[0];
        int sumDiv7 = 0;
        int sumAll = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                countChan++;
                sumChan += arr[i];
            }
            
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
            
            if (arr[i] % 7 == 0) {
                sumDiv7 += arr[i];
            }
            
            sumAll += arr[i];
        }

        int countMax = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                countMax++;
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Số lượng số chẵn: " + countChan + " | Tổng các số chẵn: " + sumChan);
        System.out.println("Phần tử lớn nhất (Max): " + max);
        System.out.println("Phần tử nhỏ nhất (Min): " + min);
        
        System.out.print("Mảng theo thứ tự đảo ngược: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Tổng các phần tử chia hết cho 7: " + sumDiv7);
        System.out.println("Trung bình cộng của mảng: " + ((double) sumAll / n));
        System.out.println("Số phần tử có giá trị bằng Max (" + max + "): " + countMax);

        scanner.close();
    }
}
