package TugasPBO7;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Create Objek MataKuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemograman 1","A",3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemograman 2","A",3);
        MataKuliah mk3 = new MataKuliah("003", "Pemograman Berorientasi Objek","AB",3);

        // Create objek KHS
        KartuHasilStudi khs = new KartuHasilStudi("20222");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);

        // Create Objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("223040039", "Miftah Fauzi");

        // Create Objek Transkrip
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.hitungIPK();
        transkrip.display();

    }
}
