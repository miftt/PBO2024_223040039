package TugasPBO12;

public class Laptop extends PerangkatElektronik {
    private int ram; // dalam GB
    private int penyimpanan; // dalam GB

    public Laptop(String merk, String model, int ram, int penyimpanan) {
        super(merk, model);
        this.ram = ram;
        this.penyimpanan = penyimpanan;
    }

    @Override
    public void informasi() {
        System.out.println("Laptop [Merk: " + merk + ", Model: " + model + ", RAM: " + ram + "GB, Penyimpanan: " + penyimpanan + "GB]");
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPenyimpanan() {
        return penyimpanan;
    }

    public void setPenyimpanan(int penyimpanan) {
        this.penyimpanan = penyimpanan;
    }
}
