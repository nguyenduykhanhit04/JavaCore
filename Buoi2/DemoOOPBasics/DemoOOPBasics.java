public class DemoOOPBasics {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(14, "Nguyen Duy Khanh 2");
        s1.printDetail();
        s2.printDetail();
    }
}

class Student {
    int id;
    String name;

    public Student() {
        this.id = 0;
        this.name = "";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDetail() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }

}