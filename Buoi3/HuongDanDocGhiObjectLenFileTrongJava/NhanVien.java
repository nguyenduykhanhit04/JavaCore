import java.io.Serializable;

public class NhanVien implements Serializable {
    String name;
    int age;

    public NhanVien(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName() {
        this.name = name;
    }

    public void setAge() {
        this.age = age;
    }
}
