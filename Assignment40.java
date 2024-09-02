package assignmentpack4;

// WAP to copy the value of Array into another array?

public class Assignment40 {

	public static void main(String[] args) {
		
		// Our original array with magical values
        int[] originalArray = {10, 20, 30, 40, 50};

        // Create a new array to hold the copied values
        int[] copiedArray = new int[originalArray.length];

        // The incantation to copy the values
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // Behold! The copied array emerges from the mist:
        System.out.println("Original Array:");
        for (int value : originalArray) {
            System.out.print(value + " ");
        }

        System.out.println("\nCopied Array:");
        for (int value : copiedArray) {
            System.out.print(value + " ");
        }

	}

}
