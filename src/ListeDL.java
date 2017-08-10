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

	public ElementDL<T> insert(T o) {
		ElementDL<T> neuesEL = new ElementDL<T>(o);
		if (head == null) {
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
		ElementDL<T> temp1 = head;
		ElementDL<T> neuesEL = new ElementDL<T>(o);
		while (temp1 != null) {
			if (temp1.element.equals(pos.element)) {

				if (temp1 != tail && temp1 != head) {
					//temp1.prev.next = temp1.next;
					//temp1.next.prev = temp1.prev;

				} else if (temp1 == tail) {
					//temp1.prev.next = null;
					//tail = temp1.prev;

				} else if (temp1 == head) {
					neuesEL.next = temp1;
					temp1.prev = neuesEL;
					head = neuesEL;
				}

				//temp1.next = null;
				//temp1.prev = null;
				break;
			}
			temp1 = temp1.next;
		}
		return neuesEL;
	}

	public void remove(ElementDL<T> e) {
		ElementDL<T> temp1 = head;
		while (temp1 != null) {
			if (temp1.element.equals(e.element)) {

				if (temp1 != tail && temp1 != head) {
					temp1.prev.next = temp1.next;
					temp1.next.prev = temp1.prev;

				} else if (temp1 == tail) {
					temp1.prev.next = null;
					tail = temp1.prev;

				} else if (temp1 == head) {

					head = temp1.next;
					temp1.next.prev = null;
				}

				temp1.next = null;
				temp1.prev = null;
				break;
			}
			temp1 = temp1.next;
		}

	}

	public String toString() {
		ElementDL<T> zeigen = head;
		String ausgabe = "";
		while (zeigen != null) {
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
		// System.out.println(liste.tail.prev.element.toString());
		liste.remove(new ElementDL<String>("Jens Maier"));
		liste.insert("Pfupferle",new ElementDL<String>("Kevin Zoller"));
		liste.insert("Sandy");

		System.out.println(liste);
	}

}