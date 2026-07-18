import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileGhi {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("data.txt");
            BufferedWriter bu = new BufferedWriter(writer);

            bu.write("Xin chao JAVA");
            bu.newLine();
            bu.write("Hoc FileWriter");

            bu.close();
            System.out.println("Ghi file thanh cong");
        } catch (IOException e) {
            System.out.println("Loi: " + e);
        }
    }

}
