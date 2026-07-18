import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Nhap duong dan file nguon: ");
            String source = input.readLine();

            System.out.print("Nhap duong dan file dich: ");
            String destination = input.readLine();

            FileReader fr = new FileReader(source);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(destination);
            BufferedWriter bw = new BufferedWriter(fw);

            int c;
            while ((c = br.read()) != -1) {
                bw.write(c);
            }

            br.close();
            bw.close();

            System.out.println("Copy file thanh cong");

        } catch (IOException e) {
            System.out.println("Copy file that bai");
            System.out.println("Loi: " + e.getMessage());
        }
    }
}