package TugasPBO12;

public class Main {
    public static void main(String[] args) {
        // lingkaran
        Lingkaran lingkaran = new Lingkaran(10);

        System.out.println("== LINGKARAN ==");
        System.out.println("Jari2: " + lingkaran.getJari2());
        System.out.println("Luas: " + lingkaran.luas());

        //tabung
        Tabung tabung = new Tabung(10, 5);
        System.out.println("== TABUNG ==");
        System.out.println("Jari2: " + tabung.getJari2());
        System.out.println("Tinggi: " + tabung.getTinggi());
        System.out.println("Luas: " + tabung.luas());
    }
}
