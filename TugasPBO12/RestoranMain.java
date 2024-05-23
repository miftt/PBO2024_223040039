package TugasPBO12;

public class RestoranMain {
    public static void main(String[] args) {
        Makanan nasiGoreng = new Makanan("Nasi Goreng", 25000);
        Minuman esTeh = new Minuman("Es Teh", 5000);

        nasiGoreng.deskripsi();
        nasiGoreng.pesan();
        nasiGoreng.bayar(25000);

        System.out.println();

        esTeh.deskripsi();
        esTeh.pesan();
        esTeh.bayar(5000);
    }
}
