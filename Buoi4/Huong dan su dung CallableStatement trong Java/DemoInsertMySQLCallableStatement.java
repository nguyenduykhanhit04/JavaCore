import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class DemoInsertMySQLCallableStatement {
    public static void main(String[] arg) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlynhanvien");
            Scanner sc = new Scanner(System.in);
            System.out.println("Moi ban nhap ma: ");
            int id = sc.nextInt();
            System.out.println("Moi ban nhap luong");
            int salary = sc.nextInt();
            System.out.println("Moi ban nhap nam sinh");
            int birthyear = sc.nextInt();
            // khoi tao mot doi tuong Scanner moi de tranh bi troi
            sc = new Scanner(System.in);
            System.out.println("Moi ban nhap ten: ");
            String name = sc.nextLine();
            System.out.println("Moi ban nhap dia chi");
            String address = sc.nextLine();
            String sql = "{CALL ThemNhanVien(?, ?, ?, ?, ?)}";
            CallableStatement statement = con.prepareCall(sql);

            int index = 0;
            statement.setInt(++index, id);
            statement.setString(++index, name);
            statement.setInt(++index, salary);
            statement.setInt(++index, birthyear);
            statement.setString(++index, address);

            int records = statement.executeUpdate();
            if (records > 0) {
                System.out.println("Ban da them moi thanh cong");
            } else {
                System.out.println("Ban da them moi that bai");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
