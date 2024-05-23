package TugasPBO12;

public class PerangkatElektronikMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", "Ideapad", 16, 512);
        Smartphone smartphone = new Smartphone("Iphone", "XR", 2900);

        laptop.informasi();
        smartphone.informasi();
    }
}
