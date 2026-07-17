package DefineExtendClass;

public class Animal {
    // Khai bao thuoc tinh cua class
    private int weight;
    private int id;

    // method getter tra lai gia tri thuoc tinh weight
    public int getWeight() {
        return weight;
    }

    // method setter thiet lap gia tri thuoc tinh weight
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // dinh nghia default constructor
    public Animal() {
        this.id = 0;
        this.weight = 0;
    }

    // dinh nghia parameterize constructor
    public Animal(int _id, int _weight) {
        this.id = _id;
        this.weight = _weight;
    }

    public void displayDetails() {
        System.out.println("Id = " + this.getId());
        System.out.println("Weight = " + this.getWeight());
    }
}
