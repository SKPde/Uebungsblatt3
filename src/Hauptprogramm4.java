import java.util.ArrayList;

public class Hauptprogramm4 {

	private static ArrayList<String> testliste = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addElement("Halberstung");
		addElement("#Bleifuß");
		addElement("Mini-EL");

		System.out.println(testliste.get(0));
		System.out.println(testliste.get(1));
		System.out.println(testliste.get(2));

		removeElement();

		System.out.println(testliste.get(0));
		System.out.println(testliste.get(1));
		System.out.println(testliste.get(2));
	}

	public static void addElement(String element) {
		testliste.add(element);
	}

	public static void removeElement() {

		for (int x = 0; x < testliste.size(); x++) {
			if (testliste.get(x) != null) {
				testliste.set(0, null);
				break;
			}
		}
	}
}
