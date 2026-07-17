public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public int minus(int a, int b, int c) {
        return a - b - c;
    }

    public int multiple(int a, int b) {
        return a * b;
    }

    public double multiple(double a, double b) {
        return a * b;
    }

    public int multiple(int a, int b, int c) {
        return a * b * c;
    }

    public int devide(int a, int b) {
        if (b == 0) {
            System.out.println("Khong chia duoc cho 0");
            return 0;
        }
        return a / b;
    }

    public double devide(double a, double b) {
        if (b == 0) {
            System.out.println("Khong chia duoc cho 0");
            return 0;
        }
        return a / b;
    }

    public int devide(int a, int b, int c) {
        if (b == 0 || c == 0) {
            System.out.println("Khong chia duoc cho 0");
            return 0;
        }
        return a / b / c;
    }
}
