package TugasPBO12;

public class InterfaceMain {
    public static void main(String[]args){
        KartuElektronik kartu = new KartuElektronik("IF11", "123");
        System.out.println("otentikasi: "+ kartu.otentikasi("123"));
    }
}
