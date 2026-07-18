import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String data = "Hello, this is a test string to save into Demo.txt file.";
        
        try (FileOutputStream fos = new FileOutputStream("Demo.txt")) {
            fos.write(data.getBytes());
            System.out.println("Successfully wrote string to 'Demo.txt'.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
