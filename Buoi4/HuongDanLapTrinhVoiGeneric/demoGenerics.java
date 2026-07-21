import java.util.ArrayList;

public class demoGenerics {
    public static void main(String[] args) {
        // type parameter
        ArrayList<String> listDishes = new ArrayList<String>();

        listDishes.add("Ga rang muoi");
        listDishes.add("Ga khong loi thoat");

        // se bi loi vi Generic kiem tra kieu du lieu ngay
        // luc bien dich
        // listDishes.add(8);

        // lay ra phan tu thu 2: khong can ep kieu
        String mon1 = listDishes.get(1);

        System.out.println("Mon an: " + mon1);
    }
}
