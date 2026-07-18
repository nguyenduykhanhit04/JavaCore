public class TextException {
    public static void main(String[] args) {
        try {
            Product p1 = new Product("Laptop", 15500, 30);
            p1.displayDetails();

            // phat sinh ngoai le name
            Product p2 = new Product("", 200, 35);
            p2.displayDetails();

            // phat sinh ngoai le name
            Product p3 = new Product("Tom hum bong", -100, 40);
            p3.displayDetails();

            // phat sinh ngoai len quantity
            Product p4 = new Product("Cua be sot me", 500, 15);
            p4.displayDetails();
        } catch (InvalidProductException e) {
            System.out.println("Co ngoai le ve san pham: " + e.getMessage());
        } finally {
            System.out.println("He thong ket thuc");
        }
    }
}
