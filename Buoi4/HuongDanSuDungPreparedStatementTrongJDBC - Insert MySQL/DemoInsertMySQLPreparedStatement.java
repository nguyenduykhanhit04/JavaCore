import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoInsertMySQLPreparedStatement {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyhaisan");
            Scanner sc = new Scanner(System.in);
            System.out.println("Moi ban nhap ma: ");
            int ma = sc.nextInt();
            System.out.println("Moi ban nhap gia: ");
            double price = sc.nextDouble();

            sc = new Scanner(System.in);
            System.out.println("Moi ban nhap ten:");
            String name = sc.nextLine();
            System.out.println("Moi ban nhap dia chi");
            String diachi = sc.nextLine();

            String sql = "insert into haisan value (?, ?, ?, ?)";
            System.out.println(sql);

            PreparedStatement pre = con.prepareStatement(sql);

            int index = 0;
            pre.setInt(++index, ma);
            pre.setString(++index, name);
            pre.setDouble(++index, price);
            pre.setString(++index, diachi);

            int records = pre.executeUpdate();
            if (records > 0 ) {
                System.out.println("Ban da them moi thanh cong");
            } else {
                System.out.println("Ban da them moi that bai");

                con.close();
            }

        } catch (Exception e) {
            System.out.printf("Loi: " + e);
        }
    }
}
