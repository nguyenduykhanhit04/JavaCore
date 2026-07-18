import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoMultiCatchChildParentException {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
