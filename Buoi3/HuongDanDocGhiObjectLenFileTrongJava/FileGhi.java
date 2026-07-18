import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileGhi {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("src\\content.txt");
            NhanVien nv = new NhanVien("Diem Huong", 24);
            ObjectOutputStream oboutput = new ObjectOutputStream(output);

            oboutput.writeObject(nv);
            oboutput.flush();
            oboutput.close();
            output.close();

        } catch (IOException e) {
            System.out.println("Loi: " + e);
        }

    }
}
