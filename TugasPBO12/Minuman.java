package TugasPBO12;

public class Minuman implements Pesanan {
    private String nama;
    private double harga;

    public Minuman(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public void pesan() {
        System.out.println("Pesanan minuman [" + nama + "] telah dilakukan.");
    }

    @Override
    public void bayar(double jumlah) {
        if (jumlah >= harga) {
            System.out.println("Pembayaran Berhasil sebesar " + jumlah + " IDR untuk minuman [" + nama + "] telah dilakukan.");
        } else {
            System.out.println("Pembayaran gagal. Jumlah yang dibayarkan kurang dari harga minuman [" + nama + "].");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void deskripsi() {
        System.out.println("Minuman [Nama: " + nama + ", Harga: " + harga + " IDR]");
    }
}
