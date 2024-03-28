package TugasPBO7;

public class Mahasiswa {
    private String NRP;
    private String nama;

    public Mahasiswa(){

    }

    public Mahasiswa(String nRP, String nama){
        NRP = nRP;
        this.nama = nama;
    }

    public String Display(){
        return "NRP :"+NRP+", Nama: "+ nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getNRP() {
        return NRP;
    }
}
