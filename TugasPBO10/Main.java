package TugasPBO10;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("098765", "Arkan", "Teknik Elektro");
        System.out.println(dosen.getNip() + " - " + dosen.getNama() + " - " + dosen.getJurusan());
    }
}