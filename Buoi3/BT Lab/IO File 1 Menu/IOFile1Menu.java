import java.io.*;
import java.util.Scanner;

public class IOFile1Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "Tony.txt";
        String dirName = "E_Drive_Mock"; // Using a local mock directory instead of E: to prevent errors
        int choice = 0;

        do {
            System.out.println("====== MENU ======");
            System.out.println("1. Ghi file");
            System.out.println("2. Doc file vua ghi");
            System.out.println("3. Tao mot thu muc");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so.");
                continue;
            }

            switch (choice) {
                case 1:
                    try (FileOutputStream fos = new FileOutputStream(fileName)) {
                        String s1 = "String 1";
                        String s2 = "String 2";
                        String s3 = "String 3";
                        String content = s1 + "\t" + s2 + "\t" + s3;
                        fos.write(content.getBytes());
                        System.out.println("Ghi file thanh cong.");
                    } catch (IOException e) {
                        System.out.println("Loi ghi file: " + e.getMessage());
                    }
                    break;
                case 2:
                    try (FileInputStream fis = new FileInputStream(fileName)) {
                        int c;
                        StringBuilder sb = new StringBuilder();
                        while ((c = fis.read()) != -1) {
                            sb.append((char) c);
                        }
                        System.out.println("Noi dung file: ");
                        System.out.println(sb.toString());
                    } catch (FileNotFoundException e) {
                        System.out.println("File chua duoc ghi.");
                    } catch (IOException e) {
                        System.out.println("Loi doc file: " + e.getMessage());
                    }
                    break;
                case 3:
                    File dir = new File(dirName);
                    if (!dir.exists()) {
                        if (dir.mkdir()) {
                            System.out.println("Tao thu muc thanh cong.");
                        } else {
                            System.out.println("Tao thu muc that bai.");
                        }
                    } else {
                        System.out.println("Thu muc da ton tai.");
                    }
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
