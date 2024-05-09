package TugasPBO10;

public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("223040039","Miftah Fauzi", "Bandung");
        System.out.println(mhs.getNrp() + "-" + mhs.getNama() + "-" + mhs.getAlamat());
    }
}