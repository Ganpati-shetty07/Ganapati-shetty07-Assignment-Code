package assignmentpack4;

import java.util.Scanner;

// Create an Array of Double data type and take the input from Scanner class

public class Assignment38 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

        // Gather the number of elements for our mystical array
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Create the array to hold our precious doubles
        double[] magicalDoubles = new double[numElements];

        // Now, let's fill the array with user-provided values
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter a double value for element " + i + ": ");
            magicalDoubles[i] = scanner.nextDouble();
        }

        // Display the enchanted array
        System.out.println("\nBehold! Your magical array of doubles:");
        for (double value : magicalDoubles) {
            System.out.println(value);
        }

        // Sheathe your scanner, brave adventurer
        scanner.close();
	}

}
