import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số số KW tiêu thụ điện : ");
        double KW = input.nextDouble();

        double tienDien = 0;
        if (KW < 100 ) {
            tienDien = 450 * KW;
        } else if (KW < 200 ) {
            tienDien = 600 * (KW - 100) + 450 * 100;
        } else if (KW < 300) {
            tienDien = 750 * (KW - 200) + 600 * 100 + 450 * 100;
        } else if (KW < 500) {
            tienDien = 900 * (KW - 300) + 750 * 100 + 600 * 100 + 450 * 100;
        } else if (KW < 1000) {
            tienDien = 1000 * (KW - 500) + 900 * 200 + 750 * 100 + 600 * 100 + 450 * 100;
        } else {
            tienDien = 1200 * (KW - 1000) + 1000 * 500 + 900 * 200 + 750 * 100 + 600 * 100 + 450 * 100;
        }

        double tienThue = tienDien * 0.1;
        double tongSoTienSauThe = tienThue + tienDien;
        System.out.println(tongSoTienSauThe);
        input.close();
    }
}
