import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadWriteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileOutputStream out = new FileOutputStream("Tony.txt");
            System.out.println("Nhap 5 chuoi: ");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Chuoi " + i + ": ");
                String s = sc.nextLine();

                // ghi chuoi
                out.write(s.getBytes());

                // xuong dong
                out.write("\n".getBytes());
            }
            out.close();

            System.out.println("Da ghi file thanh cong");
            FileInputStream in = new FileInputStream("Tony.txt");

            int c;
            String content = "";

            while ((c = in.read()) != -1) {
                content += (char) c;
            }

            in.close();

            System.out.println("Noi dung file: ");
            System.out.println(content);

            String[] lines = content.split("\n");

            ArrayList<String> list = new ArrayList<>();

            for (String line : lines) {
                list.add(line);
            }

            Collections.reverse(list);

            System.out.println("Nội dung file theo thứ tự đảo ngược:");

            for (String line : list) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Loi: " + e);
        }
        sc.close();
        System.out.println("Ket thuc chuong trinh");
    }
}
