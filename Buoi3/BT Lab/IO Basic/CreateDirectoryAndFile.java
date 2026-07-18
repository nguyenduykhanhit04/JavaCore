import java.io.File;
import java.io.IOException;

public class CreateDirectoryAndFile {
    public static void main(String[] args) {
        File dir = new File("Business");
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("Directory 'Business' created successfully.");
            } else {
                System.out.println("Failed to create directory 'Business'.");
                return;
            }
        } else {
            System.out.println("Directory 'Business' already exists.");
        }

        File file = new File(dir, "Demo.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File 'Demo.txt' created successfully in 'Business' directory.");
            } else {
                System.out.println("File 'Demo.txt' already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
