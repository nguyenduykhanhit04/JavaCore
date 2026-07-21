import java.util.HashMap;

public class HashMapInJava {
    public static void main(String[] args) {
        // Khoi tao hashmap
        HashMap<Integer, String> listseafoods = new HashMap<Integer, String>();

        // Them cac phan tu vao hash map
        listseafoods.put(1, "Ngoc Trinh");
        listseafoods.put(2, "Ngoc Chinh");
        listseafoods.put(3, "Ngoc Chinhs");
        listseafoods.put(4, "Ngoc Chinhss");
        listseafoods.put(5, "Ngoc Chinhsss");

        // Kiem tra su ton tai cua key 2
        System.out.println("Check if key 2 exists: " + listseafoods.containsKey(2));

        // Kiem tra su ton tai cua value 'Ngoc Trinh'
        System.out.println("Check if value 'Ngoc Trinh' exists" + listseafoods.containsValue("Ngoc Trinh"));

        // Ly ve gia tri cua key 3
        String val = (String)listseafoods.get(3);

        // Check the value
        System.out.println("Value for key 3 is: " + val);

        // Xoa di value cua key 2
        listseafoods.remove(2);

        System.out.println("Values after remove: " + listseafoods);

        // Hien thi danh sach cac values
        System.out.println(listseafoods.values());
    }
}
