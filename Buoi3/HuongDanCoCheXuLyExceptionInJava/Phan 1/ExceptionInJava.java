package HuongDanCoCheXuLyExceptionInJava;

public class ExceptionInJava {
    public static void main(String[] args) {
        try {
            // Khai bao chuoi la null va truy cap den chuoi null
            String s = "demo";
            System.out.println("Do dai chuoi la: " + s.length());

            // Khai bao va khoi tao mang co 3 phan tu
            // Sau do truy cap den phan tu thu 6 cua mang
            int a[] = {4, 7, 9};
            System.out.println("a[5] = " + a[2]);

            // Chuyen mot string khong hop le thanh so
            String s1 = "40";
            int i = Integer.parseInt(s1);
            System.out.println("So la: " + i);

            // Loi chia mot so cho 0
            int x = 4;
            int y = 2;
            int z = x/y;
            System.out.println("Ket thuc khoi try");

            // Khai bao chuoi la null va truy cap den chuoi null
            String s = null;
            System.out.println("Do dai chuoi la: " + s.length());

            // Khai bao va khoi tao mang co 3 phan tu
            // Sau do truy cap den phan tu thu 6 cua mang
            int b[] = {4, 7, 9};
            System.out.println("b[5] = " + b[5]);

            // Chuyen mot string khong hop le thanh so
            String sn = "abc";
            int so = Integer.parseInt(sn);
            System.out.println("So la: " + so);

            String sl = "40";
            int soo = Integer.parseInt(sl);
            System.out.println("So la: " + soo);

            // Loi chia mot so cho 0
            int xx = 4;
            int yy = 0;
            int zz = xx / yy;

            System.out.println("Ket thuc khoi try");
        } catch (NullPointerException e) {
            // Khoi catch nay xu ly khi truy cap den doi tuong null
            System.out.println("Loi chua khoi tao doi tuong !");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            // Khoi catch nay xu ly khi ta truy cap den phan tu
            // Vuot qua kich thuoc mang
            System.out.println("Loi tran mang! ");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            // Khoi catch nay xu ly khi ta dinh dang so khong hop le
            System.out.println("Loi dinh dang so! ");
            e.printStackTrace();
        } catch (Exception e) {
            // Khoi catch xu ly duoc mot ngoai le
            System.out.println("Co loi xay ra trong qua trinh thuc thi! ");
            e.printStackTrace();
        } finally {
            System.out.println("Ket thuc chuong trinh! ");
        }
    }
}
