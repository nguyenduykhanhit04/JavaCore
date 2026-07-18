import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileDoc {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("src//content.txt");
            ObjectInputStream obinput = new ObjectInputStream(input);

            NhanVien emp = (NhanVien)obinput.readObject();

            System.out.println("Name = " + emp.getName());
            System.out.println("Age = " + emp.getAge());

            obinput.close();
            input.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }  catch (IOException e) {
            System.out.println("Loi: " + e);
        }

    }
}
