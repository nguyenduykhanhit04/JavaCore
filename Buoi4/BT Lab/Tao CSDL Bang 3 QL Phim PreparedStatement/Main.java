import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            
            // Tao CSDL
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS quanlybanphim CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci");
            stmt.executeUpdate("USE quanlybanphim");

            // Tao cac bang
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS THE_LOAI (MTL INT AUTO_INCREMENT PRIMARY KEY, Ten_the_loai VARCHAR(50))");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS KHACH_HANG (MKH INT AUTO_INCREMENT PRIMARY KEY, Ho_khach_hang VARCHAR(50), Ten_khach_hang VARCHAR(20), Ten_dang_nhap VARCHAR(20), Mat_khau VARCHAR(20), Gioi_tinh BIT, Dia_chi VARCHAR(100), Email VARCHAR(20), Quan_tri BIT)");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS PHIM (MP INT AUTO_INCREMENT PRIMARY KEY, Ten_phim VARCHAR(100), Ten_tieng_ANH VARCHAR(100), Noi_dung TEXT, Dien_vien VARCHAR(100), Hinh_minh_hoa VARCHAR(50), Hang_san_xuat VARCHAR(100), Ngay_cap_nhat DATETIME, Don_gia INT, So_luong INT)");
            
            // Xoa du lieu cu
            stmt.executeUpdate("DELETE FROM PHIM");
            stmt.executeUpdate("DELETE FROM KHACH_HANG");
            stmt.executeUpdate("DELETE FROM THE_LOAI");

            System.out.println("--- Tao bang thanh cong ---");

            // 1. Chèn vào mỗi bảng 5 dòng dữ liệu
            String insertTheLoai = "INSERT INTO THE_LOAI (Ten_the_loai) VALUES (?)";
            PreparedStatement psTL = conn.prepareStatement(insertTheLoai);
            for (int i = 1; i <= 5; i++) {
                psTL.setString(1, "The Loai " + i);
                psTL.executeUpdate();
            }

            String insertKH = "INSERT INTO KHACH_HANG (Ho_khach_hang, Ten_khach_hang, Ten_dang_nhap, Mat_khau, Gioi_tinh, Dia_chi, Email, Quan_tri) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement psKH = conn.prepareStatement(insertKH);
            for (int i = 1; i <= 5; i++) {
                psKH.setString(1, "Ho " + i);
                psKH.setString(2, "Ten " + i);
                psKH.setString(3, "user" + i);
                psKH.setString(4, "pass" + i);
                psKH.setInt(5, i % 2); // 1 hoac 0
                psKH.setString(6, "Dia chi " + i);
                psKH.setString(7, "email" + i + "@gmail.com");
                psKH.setInt(8, 0);
                psKH.executeUpdate();
            }

            String insertPhim = "INSERT INTO PHIM (Ten_phim, Ten_tieng_ANH, Noi_dung, Dien_vien, Hinh_minh_hoa, Hang_san_xuat, Ngay_cap_nhat, Don_gia, So_luong) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement psPhim = conn.prepareStatement(insertPhim);
            // Insert Phim 1
            psPhim.setString(1, "Kiếm hiệp 1"); psPhim.setString(2, "Sword 1"); psPhim.setString(3, "Noi dung 1"); psPhim.setString(4, "Lâm Chí Linh"); psPhim.setString(5, "hinh1.jpg"); psPhim.setString(6, "Hang 1"); psPhim.setDate(7, new Date(System.currentTimeMillis())); psPhim.setInt(8, 10000); psPhim.setInt(9, 30); psPhim.executeUpdate();
            // Insert Phim 2
            psPhim.setString(1, "Hành động"); psPhim.setString(2, "Action"); psPhim.setString(3, "Noi dung 2"); psPhim.setString(4, "Lâm Chí Linh"); psPhim.setString(5, "hinh2.jpg"); psPhim.setString(6, "Hang 2"); psPhim.setDate(7, new Date(System.currentTimeMillis())); psPhim.setInt(8, 30000); psPhim.setInt(9, 60); psPhim.executeUpdate();
            // Insert Phim 3
            psPhim.setString(1, "Kiếm hiệp 2"); psPhim.setString(2, "Sword 2"); psPhim.setString(3, "Noi dung 3"); psPhim.setString(4, "Diễn viên 3"); psPhim.setString(5, "hinh3.jpg"); psPhim.setString(6, "Hang 3"); psPhim.setDate(7, new Date(System.currentTimeMillis())); psPhim.setInt(8, 50000); psPhim.setInt(9, 45); psPhim.executeUpdate();
            // Insert Phim 4
            psPhim.setString(1, "Tình cảm"); psPhim.setString(2, "Romance"); psPhim.setString(3, "Noi dung 4"); psPhim.setString(4, "Diễn viên 4"); psPhim.setString(5, "hinh4.jpg"); psPhim.setString(6, "Hang 4"); psPhim.setDate(7, new Date(System.currentTimeMillis())); psPhim.setInt(8, 100000); psPhim.setInt(9, 10); psPhim.executeUpdate();
            // Insert Phim 5
            psPhim.setString(1, "Hài kịch"); psPhim.setString(2, "Comedy"); psPhim.setString(3, "Noi dung 5"); psPhim.setString(4, "Diễn viên 5"); psPhim.setString(5, "hinh5.jpg"); psPhim.setString(6, "Hang 5"); psPhim.setDate(7, new Date(System.currentTimeMillis())); psPhim.setInt(8, 30000); psPhim.setInt(9, 100); psPhim.executeUpdate();

            System.out.println("Da chen du lieu mau!");

            // 2. Tìm tất cả các phim có số lượng nằm trong khoảng từ 20 đến 50
            System.out.println("\n-- Phim co so luong tu 20 den 50 --");
            PreparedStatement ps2 = conn.prepareStatement("SELECT * FROM PHIM WHERE So_luong BETWEEN 20 AND 50");
            ResultSet rs = ps2.executeQuery();
            while(rs.next()) { System.out.println(rs.getString("Ten_phim") + " - So luong: " + rs.getInt("So_luong")); }

            // 3. Tìm tất cả các phim có tên bắt đầu bằng chữ ‘Kiếm’
            System.out.println("\n-- Phim co ten bat dau bang 'Kiếm' --");
            PreparedStatement ps3 = conn.prepareStatement("SELECT * FROM PHIM WHERE Ten_phim LIKE ?");
            ps3.setString(1, "Kiếm%");
            rs = ps3.executeQuery();
            while(rs.next()) { System.out.println(rs.getString("Ten_phim")); }

            // 4. Tìm 2 khách hàng đầu tiên trong bảng KHACH_HANG
            System.out.println("\n-- 2 khach hang dau tien --");
            PreparedStatement ps4 = conn.prepareStatement("SELECT * FROM KHACH_HANG LIMIT 2");
            rs = ps4.executeQuery();
            while(rs.next()) { System.out.println(rs.getString("Ten_khach_hang")); }

            // 5. Tìm thông tin của các khách hàng có giới tính là nam và đếm tổng số
            System.out.println("\n-- Khach hang nam --");
            PreparedStatement ps5 = conn.prepareStatement("SELECT * FROM KHACH_HANG WHERE Gioi_tinh = 1");
            rs = ps5.executeQuery();
            int countNam = 0;
            while(rs.next()) { 
                System.out.println(rs.getString("Ten_khach_hang")); 
                countNam++;
            }
            System.out.println("Tong so khach hang nam: " + countNam);

            // 6. Tìm chi tiết về phim có mức giá lớn nhất và nhỏ nhất
            System.out.println("\n-- Phim co gia max va min --");
            PreparedStatement ps6 = conn.prepareStatement("SELECT * FROM PHIM WHERE Don_gia = (SELECT MAX(Don_gia) FROM PHIM) OR Don_gia = (SELECT MIN(Don_gia) FROM PHIM)");
            rs = ps6.executeQuery();
            while(rs.next()) { System.out.println(rs.getString("Ten_phim") + " - Gia: " + rs.getInt("Don_gia")); }

            // 7. Tính tổng giá và giá trung bình của các phim
            System.out.println("\n-- Tong gia va gia trung binh --");
            PreparedStatement ps7 = conn.prepareStatement("SELECT SUM(Don_gia) as Tong, AVG(Don_gia) as TB FROM PHIM");
            rs = ps7.executeQuery();
            if(rs.next()) { System.out.println("Tong: " + rs.getInt("Tong") + ", Trung binh: " + rs.getDouble("TB")); }

            // 8. Tìm tất cả phim do diễn viên “Lâm Chí Linh” thủ vai
            System.out.println("\n-- Phim do Lam Chi Linh thu vai --");
            PreparedStatement ps8 = conn.prepareStatement("SELECT * FROM PHIM WHERE Dien_vien LIKE ?");
            ps8.setString(1, "%Lâm Chí Linh%");
            rs = ps8.executeQuery();
            while(rs.next()) { System.out.println(rs.getString("Ten_phim")); }

            // 9. Xóa thông tin về những phim có giá < 15.000 VND
            PreparedStatement ps9 = conn.prepareStatement("DELETE FROM PHIM WHERE Don_gia < ?");
            ps9.setInt(1, 15000);
            int deleted = ps9.executeUpdate();
            System.out.println("\nDa xoa " + deleted + " phim co gia < 15000.");

            // 10. Sửa thông tin về những phim có giá = 30.000 VND trở thành giá = 40.000
            PreparedStatement ps10 = conn.prepareStatement("UPDATE PHIM SET Don_gia = ? WHERE Don_gia = ?");
            ps10.setInt(1, 40000);
            ps10.setInt(2, 30000);
            int updated = ps10.executeUpdate();
            System.out.println("Da cap nhat " + updated + " phim co gia tu 30000 thanh 40000.");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
