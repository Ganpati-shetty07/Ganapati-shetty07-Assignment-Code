package assignmentpack6;
// WAP to showcase the Encapsulation using String data type

public class Assignment56 {

	
		   // Our hidden spell—a secret incantation
	    private String secretSpell;

	    // The ancient scroll to set the secret spell
	    public void setSecretSpell(String spell) {
	        secretSpell = spell;
	    }

	    // The mystical mirror to reveal the secret spell
	    public String getSecretSpell() {
	        return secretSpell;
	    }

	    public static void main(String[] args) {
	        // Our spellbook emerges from the mist
	    	Assignment56 ancientScroll = new Assignment56();

	        // We set the secret spell (encapsulated!)
	        ancientScroll.setSecretSpell("Lumos Maximus");

	        // The oracle reveals the hidden knowledge
	        System.out.println("The secret spell is: " + ancientScroll.getSecretSpell());

	}

}
