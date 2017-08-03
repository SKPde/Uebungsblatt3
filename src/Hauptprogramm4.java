import java.util.ArrayList;

public class Hauptprogramm4 {

	private static ArrayList<String> testliste = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addElement("Halberstung");
		addElement("#Bleifuß");
		addElement("Mini-EL");
		
		listeAusgeben();

		removeElement();

		listeAusgeben();
		
		removeElement();
		
		listeAusgeben();
		
		addElement("Zoller");
		addElement("Zeuge");
		
		listeAusgeben();
	}

	public static void addElement(String element) {
		testliste.add(element);
	}

	public static void removeElement() {

		for (int x = 0; x < testliste.size(); x++) {
			if (testliste.get(x) != null) {
				testliste.set(x, null);
				break;
			}
		}
	}
	
	public static void listeAusgeben() {
		for(int x = 0; x < testliste.size(); x++) {
			System.out.println(testliste.get(x));
		}
	}
}
