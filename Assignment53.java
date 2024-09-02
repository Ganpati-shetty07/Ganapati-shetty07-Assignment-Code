package assignmentpack6;
// Perform all the methods of StringBuffer using StringBuilder

public class Assignment53 {

	public static void main(String[] args) {
	
		// Let's create our magical StringBuilder
        StringBuilder spellbook = new StringBuilder("Abracadabra");

        // Append new runes to our spellbook
        spellbook.append(" Alakazam!");

        // Insert a secret glyph at a specific index
        spellbook.insert(5, " Shazam,");

        // Replace an existing rune with a more potent one
        spellbook.replace(0, 4, "Hocus");

        // Delete a forbidden word (shh, don't tell anyone)
        spellbook.delete(10, 18);

        // Reverse the incantation (because why not?)
        spellbook.reverse();

        // The final revelation—the complete spell!
        System.out.println("The ultimate incantation: " + spellbook);
	}

}
