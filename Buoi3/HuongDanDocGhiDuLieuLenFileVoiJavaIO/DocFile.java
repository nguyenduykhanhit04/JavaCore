import java.io.FileInputStream;

public class DocFile {
    public static void main(String[] args) {
        try {
            // B1: Tạo luồng đọc
            FileInputStream in = new FileInputStream("src/data.txt");

            // B2: Đọc từng byte
            int i;
            while ((i = in.read()) != -1) {
                System.out.print((char) i);
            }

            // B3: Đóng luồng
            in.close();
        } catch(Exception e) {
            System.out.println("Loi: " + e);
        }
    }
}
