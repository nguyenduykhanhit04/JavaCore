import java.io.FileOutputStream;

public class GhiFile {
    public static void main(String[] args) {
        try {
            // B1: Tạo luồng ghi
            FileOutputStream out = new FileOutputStream("src/data.txt");

            // B2: Ghi dữ liệu
            String text = "Xin chao Java!";
            out.write(text.getBytes());

            // B3: Đóng luồng
            out.close();

            System.out.println("Ghi file thành công!");

        } catch (Exception e) {
            System.out.println("Loi: " + e);
        }
    }

}
