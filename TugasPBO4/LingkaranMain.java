package TugasPBO4;


/**
 *
 * @author alzxi
 */
public class LingkaranMain {

	public static void main(String[] args) {
	   LingkaranBase l1 = new LingkaranBase(5);
	   LingkaranBase l2 = l1;
       System.out.println(l1.getJari2()); //5
       System.out.println(l2.getJari2()); //5
       ubahJari2(l2);
       System.out.println(l1.getJari2()); //4
       System.out.println(l2.getJari2());	 //4	   
	}

	public static void ubahJari2(LingkaranBase obj) {
	   obj.setJari2(4);
	} 
}