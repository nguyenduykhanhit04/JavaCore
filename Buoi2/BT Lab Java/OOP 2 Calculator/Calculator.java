public class Calculator {

    public double add(double a, double b)
    {
        return a + b;
    }
    public double minus(double a, double b)
    {
        return a - b;
    }
    public double devide(double a, double b)
    {
        if (b == 0) {
            System.out.println("Khong the chia duoc cho 0");
            return 0;
        }
        return a / b;
    }
    public double multiple(double a, double b)
    {
        return a * b;
    }

}
