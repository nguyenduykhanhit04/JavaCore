import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = ""; // Đổi password nếu cần

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            
            // 1. Tạo CSDL
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS quanlysinhvien");
            stmt.executeUpdate("USE quanlysinhvien");

            // 2. Tạo bảng
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS KHOA (MaKH VARCHAR(2) PRIMARY KEY, TenKH VARCHAR(50))");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS MON (MaMH VARCHAR(2) PRIMARY KEY, TenMH VARCHAR(25), SoTiet INT)");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS SINHVIEN (MaSV VARCHAR(3) PRIMARY KEY, HoSV VARCHAR(15), TenSV VARCHAR(100), Phai BIT, NgaySinh DATE, NoiSinh VARCHAR(15), MaKH VARCHAR(2), HocBong DOUBLE)");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS KETQUA (MaSV VARCHAR(3), MaMH VARCHAR(2), Diem FLOAT, PRIMARY KEY(MaSV, MaMH))");

            // Xóa dữ liệu cũ để chạy lại không bị lỗi Duplicate Key
            stmt.executeUpdate("DELETE FROM KETQUA");
            stmt.executeUpdate("DELETE FROM SINHVIEN");
            stmt.executeUpdate("DELETE FROM MON");
            stmt.executeUpdate("DELETE FROM KHOA");

            // 3. Chèn dữ liệu mẫu
            stmt.executeUpdate("INSERT INTO KHOA VALUES ('AV', 'Anh Văn'), ('TH', 'Tin Học'), ('TR', 'Triết')");
            stmt.executeUpdate("INSERT INTO MON VALUES ('01', 'Cơ sở dữ liệu', 45), ('02', 'Trí tuệ nhân tạo', 45), ('03', 'Truyền tin', 45), ('04', 'Đồ họa', 60), ('05', 'Văn phạm', 60)");
            stmt.executeUpdate("INSERT INTO SINHVIEN VALUES ('A01', 'Nguyễn thị', 'Hải', 0, '1977-02-23', 'Hà Nội', 'TH', 130000), ('A02', 'Trần văn', 'Chính', 1, '1977-12-24', 'Bình Định', 'TH', 150000), ('A03', 'Lê thu bạch', 'Yến', 0, '1977-02-21', 'Tp HCM', 'TH', 170000), ('A04', 'Trần anh', 'Tuấn', 1, '1977-12-20', 'Hà Nội', 'AV', 80000), ('B01', 'Trần thanh', 'Mai', 0, '1977-08-12', 'Hải Phòng', 'TR', 0), ('B02', 'Trần thị thu', 'Thủy', 0, '1977-01-02', 'Tp HCM', 'AV', 0)");
            stmt.executeUpdate("INSERT INTO KETQUA VALUES ('A01', '01', 3), ('A01', '02', 6), ('A01', '03', 5), ('A02', '01', 4.5), ('A02', '03', 10), ('A02', '05', 9), ('A03', '01', 2), ('A03', '03', 2.5), ('A04', '05', 10), ('B01', '01', 7), ('B01', '03', 2.5), ('B02', '02', 6), ('B02', '04', 10)");

            // Chèn thêm sinh viên mã A05 để test câu Update
            stmt.executeUpdate("INSERT INTO SINHVIEN VALUES ('A05', 'Tran', 'Tien', 1, '1999-01-01', 'HCM', 'TH', 10000)");

            System.out.println("--- Tao bang va chen du lieu mau thanh cong ---");

            // 4. Các câu lệnh truy vấn
            // - Chèn thêm vào mỗi bảng 10 bản ghi
            for(int i=10; i<20; i++) {
                stmt.executeUpdate("INSERT IGNORE INTO KHOA (MaKH, TenKH) VALUES ('K" + i + "', 'Khoa " + i + "')");
                stmt.executeUpdate("INSERT IGNORE INTO MON (MaMH, TenMH, SoTiet) VALUES ('M" + i + "', 'Mon " + i + "', 30)");
                stmt.executeUpdate("INSERT IGNORE INTO SINHVIEN (MaSV, HoSV, TenSV, Phai, NgaySinh, NoiSinh, MaKH, HocBong) VALUES ('S" + i + "', 'Ho', 'Ten" + i + "', 1, '2000-01-01', 'HN', 'K" + i + "', 50000)");
                stmt.executeUpdate("INSERT IGNORE INTO KETQUA (MaSV, MaMH, Diem) VALUES ('S" + i + "', 'M" + i + "', 8)");
            }
            System.out.println("Da chen them 10 ban ghi vao moi bang.");

            // - In ra 3 sinh viên có học bổng cao nhất
            System.out.println("\n--- 3 sinh vien co hoc bong cao nhat ---");
            ResultSet rs = stmt.executeQuery("SELECT * FROM SINHVIEN ORDER BY HocBong DESC LIMIT 3");
            while (rs.next()) {
                System.out.println(rs.getString("MaSV") + " - " + rs.getString("HoSV") + " " + rs.getString("TenSV") + " - Hoc Bong: " + rs.getDouble("HocBong"));
            }

            // - Tìm ra sinh viên có tên bắt đầu bằng chữ ‘T’
            System.out.println("\n--- Sinh vien co ten bat dau bang chu 'T' ---");
            rs = stmt.executeQuery("SELECT * FROM SINHVIEN WHERE TenSV LIKE 'T%'");
            while (rs.next()) {
                System.out.println(rs.getString("MaSV") + " - " + rs.getString("HoSV") + " " + rs.getString("TenSV"));
            }

            // - Cập nhật sinh viên có mã A05: Đổi tên thành ‘Tony Nguyễn’
            stmt.executeUpdate("UPDATE SINHVIEN SET TenSV = 'Tony Nguyễn' WHERE MaSV = 'A05'");
            System.out.println("\nDa cap nhat sinh vien A05 thanh Tony Nguyễn.");

            // - Xóa sinh viên có học bổng = 0
            int deleted = stmt.executeUpdate("DELETE FROM SINHVIEN WHERE HocBong = 0");
            System.out.println("\nDa xoa " + deleted + " sinh vien co hoc bong = 0.");

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
