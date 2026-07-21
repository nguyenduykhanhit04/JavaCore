import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DemoInsertMySQL {
    public static void main(String[] args) {
        try {
            // B1: Load driver
//            Class.forName("com.mysql.jdbc.Driver");
            // B2: Mo ket noi
            Connection con = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/quanlyhaisan", "root", "");
            // B3: Tao cau lenh sql
            String sql = "insert into haisan (ma, ten, gia, diachi)" +
                    "values (12, 'Nhum bien nuong mo hanh', 300, 'Bien Da Nang')";
            // B4: Tao doi tuong statement
            Statement sta = con.createStatement();

            // B5: Thuc thi cau sql
            int records = sta.executeUpdate(sql);
            if (records > 0) {
                System.out.printf("Ban da them moi thanh cong!");
            } else {
                System.out.println("Ban da them moi that bai!");
            }

            // B6: Dong ket noi den CSDL
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
