public class NhanVien {
    public int tinhluong(int sogio) {
        return sogio * 100000;
    }

    public int tinhluong(int sogio, int thuong) {
        return (sogio * 100000) + thuong;
    }

    public int tinhluong(int sogio, int thuong, int phat) {
        return (sogio * 100000) + thuong - phat;
    }

    public double tinhluong(int sogio, int thuong, int phat, double heso) {
        return ((sogio * 100000) + thuong - phat) * heso;
    }
}
