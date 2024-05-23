package TugasPBO12;
public abstract class PerangkatElektronik {
    protected String merk;
    protected String model;

    public PerangkatElektronik(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public abstract void informasi();

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
