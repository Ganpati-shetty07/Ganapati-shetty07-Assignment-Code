package assignmentpack6;

// Wap to check if vector can be iterated through ITERATOR, list iterator or Enumeration

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Assignment52 {

	public static void main(String[] args) {
		 Vector<String> ancientVector = new Vector<>();
	        ancientVector.add("Arcane");
	        ancientVector.add("Enigma");
	        ancientVector.add("Mystery");
	        ancientVector.add("Cipher");

	        // The Iterator—an old scroll reader
	        System.out.println("Using Iterator:");
	        Iterator<String> iterator = ancientVector.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // The ListIterator—a time-traveling scribe
	        System.out.println("\nUsing ListIterator (backward):");
	        ListIterator<String> listIterator = ancientVector.listIterator(ancientVector.size());
	        while (listIterator.hasPrevious()) {
	            System.out.println(listIterator.previous());
	        }

	        // The Enumeration—a relic from ancient times
	        System.out.println("\nUsing Enumeration:");
	        Enumeration<String> enumeration = ancientVector.elements();
	        while (enumeration.hasMoreElements()) {
	            System.out.println(enumeration.nextElement());
	        }

	}

}
