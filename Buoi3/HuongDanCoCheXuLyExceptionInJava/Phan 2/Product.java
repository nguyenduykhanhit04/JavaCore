public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) throws InvalidProductException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidProductException("Ten san pham khong duoc de trong");
        }

        if (price <= 0) {
            throw new InvalidProductException("Gia san pham phai lon hon 0");
        }

        if (quantity <= 20) {
            throw new InvalidProductException("So luong san pham - hai san phai lon hon 20 !");
        }

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println("ten san pham: " + name);
        System.out.println("Gia san pham: " + price);
        System.out.println("So luong san pham: " + quantity);
    }
}
