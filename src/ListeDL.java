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
	
}