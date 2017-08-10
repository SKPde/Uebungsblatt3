public class ListeDL<T> {

	static class ElementDL<E> {

		private E element; // Inhalt des Listenelements
		private ElementDL<E> next; // Verweis auf Nachfolger
		private ElementDL<E> prev; // Verweis auf Vorgänger

		public ElementDL(E o) {
			element = o;
			next = null;
			prev = null;
		}

	}

	private ElementDL<T> head; // Referenz auf Anfang der Liste
	private ElementDL<T> tail; // Referenz auf Ende der Liste

	public ElementDL<T> insert (T o){
		ElementDL<T> neuesEL = new ElementDL<T>(o);
		if(head == null) {
			head = neuesEL;
			tail = head;
			neuesEL.prev = null;
			} else {
				tail.next = neuesEL;
				neuesEL.prev = tail;
				tail = neuesEL;
			}
		
		return neuesEL;
		
	}

	public ElementDL<T> insert(T o, ElementDL<T> pos) {
		return null;

	}

	public void remove(ElementDL<T> e) {

	}

	public String toString() {
		ElementDL<T> zeigen = head;
		String ausgabe = "";
		while(zeigen != null) {
			ausgabe = ausgabe + " [" + zeigen.element.toString() + "] ";
			zeigen = zeigen.next;
		}
		
		
		return ausgabe;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeDL<String> liste = new ListeDL<String>();
		liste.insert("Kevin Zoller");
		liste.insert("Simonk Übel");
		liste.insert("Jochen Doll");
		liste.insert("Jens Maier");
		
		System.out.println(liste);
		System.out.println(liste.tail.prev.element.toString());
	}

}