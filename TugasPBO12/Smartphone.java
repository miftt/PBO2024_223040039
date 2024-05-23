package TugasPBO12;

public class Smartphone extends PerangkatElektronik {
    private int kapasitasBaterai; // dalam mAh

    public Smartphone(String merk, String model, int kapasitasBaterai) {
        super(merk, model);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    @Override
    public void informasi() {
        System.out.println("Smartphone [Merk: " + merk + ", Model: " + model + ", Kapasitas Baterai: " + kapasitasBaterai + "mAh]");
    }

    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }
}
