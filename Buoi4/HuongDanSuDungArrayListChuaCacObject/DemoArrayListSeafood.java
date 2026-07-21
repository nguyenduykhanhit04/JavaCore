import java.util.ArrayList;

public class DemoArrayListSeafood {
    public static void main(String[] args) {
        ArrayList<Staff> listStaffs = new ArrayList<>();
        listStaffs.add(new Staff(1, "Ngoc Trinh", 23, "Nha Trang"));
        listStaffs.add(new Staff(2, "Ngoc Chinh", 22, "Da Nang"));

        // Duyet qua danh sach nhan vien
        for (Staff s : listStaffs) {
            System.out.println("Id = " + s.getId());
            System.out.println("Name = " + s.getName());
            System.out.println("Age = " + s.getAge());
            System.out.println("Address = " + s.getAddress());
        }

        // Chen du lieu nhanh vien vao ArrayList
        Staff newObj = new Staff(20, "Ha Kieu Anh", 45, "Paris");
        listStaffs.add(5, newObj);

        // Cap nhat du lieu nhanvien
        Staff obj = listStaffs.get(4);
        obj.setName("Quynh Nga");
        obj.setAge(33);

        // Xoa thong tin nhan vien
        listStaffs.remove(3);

        // Duyet qua danh sach nhan vien
        for (Staff s : listStaffs) {
            System.out.println("Id = " + s.getId());
            System.out.println("Name = " + s.getName());
            System.out.println("Age = " + s.getAge());
            System.out.println("Address = " + s.getAddress());
        }
    }
}
