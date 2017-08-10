public class ListeL<I extends Comparable<I>> {

  static class ElementL<K> {
    private K inhalt;           // Inhalt des Listenelements
    private ElementL<K> next;   // Verweis auf den Nachfolger
    public ElementL (K o) {
      inhalt = o;
      next = null;
    }
  }
  
  private ElementL<I> head;       // Referenz auf den Anfang der Liste
  
  public ListeL () {
    head = null;
  }

  public ListeL (I o) {
    head = new ElementL<I>(o);
  }

  public ElementL<I> insert (I o) {   // am Anfang einf�gen
    ElementL<I> newEl = new ElementL<I>(o);
    if (head == null) { // Liste ist noch leer
      head = newEl;
    } 
    else {
      newEl.next = head;
      head = newEl;
    }
    return newEl;
  }

  public ElementL<I> insert (I o, ElementL<I> pred) { // nach pred (Vorg�nger) einf�gen
    ElementL<I> newEl = new ElementL<I>(o);
    if (pred == null) { // am Anfang einf�gen
      newEl.next = head;
      head = newEl;
    }
    else {  // nach pred (Vorg�nger) einf�gen
      newEl.next = pred.next;
      pred.next = newEl;
    }
    return newEl;
  }
  
  public ElementL<I> insert (ElementL<I> pos, I o){
	  ElementL<I> temp = head;
	  ElementL<I> temp2 = temp.next;;
	  while(temp.next != null) {
		  if(temp.equals(pos)) {
			  temp2 = temp.next;
			  temp.next = new ElementL<I>(o);
			  temp.next.next = temp2;
			  break;
		  }
		  temp = temp.next;
	  }
	  
	  
	  
	  return temp.next;
	  
  }
  
  public void remove (ElementL<I> pred) {  // Element nach pred (Vorg�nger) l�schen
    if (pred == null) // erstes Element l�schen
      head = head.next;
    else if (pred.next != null)  // Element nach pred (Vorg�nger) l�schen
      pred.next = pred.next.next;
  }
  
  public String toString() {
    String s = "(";
    ElementL<I> help = head;
    while (help != null && help.next != null) {
      s = s + help.inhalt + ", ";
      help = help.next;
    }
    if (help != null)
      s = s + help.inhalt;
    return s + ")";
  }

  // Test
  
  public static void main (String[] args) {
    ListeL<Integer> l = new ListeL<Integer>();
    l.insert(0);
    ElementL<Integer> eins = l.insert(new Integer(1));
    ElementL<Integer> zero = l.insert(new Integer(0));
    ElementL<Integer> sechs = l.insert(new Integer(6));
    l.insert(3);
    System.out.println(l);
    l.insert(2, eins);  // nach eins einf�gen
    System.out.println(l);
    l.remove(eins);  // Nachfolger von eins l�schen
    System.out.println(l);
    l.insert(eins, 45);
    System.out.println(l);
    l.insert(sechs, 18);
    l.insert(zero, 99);
    System.out.println(l);
  }
  
}
