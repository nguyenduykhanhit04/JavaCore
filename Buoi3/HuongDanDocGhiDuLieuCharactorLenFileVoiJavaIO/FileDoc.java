import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDoc {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Data.txt");

            BufferedReader buff = new BufferedReader(reader);

            String line;

            while ((line = buff.readLine()) != null) {
                System.out.println(line);
            }

            buff.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
