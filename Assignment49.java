package assignmentpack5;

// WAP to handle the String Out Of Bound Exception using Exception Handling

public class Assignment49 {

	public static void main(String[] args) {
		
		 try {
	            // Our mystical string
	            String ancientScroll = "The secrets of the lost city.";

	            // The reckless adventurer attempts to read beyond the scroll's limits
	            char forbiddenCharacter = ancientScroll.charAt(100);

	            // Alas! The String Out Of Bounds Exception awakens!
	            System.out.println("The forbidden character: " + forbiddenCharacter);
	        } catch (StringIndexOutOfBoundsException e) {
	            // Fear not! We catch the exception and shield our code.
	            System.out.println("Beware! You've ventured beyond the scroll's boundaries.");
	        }
	}

}
