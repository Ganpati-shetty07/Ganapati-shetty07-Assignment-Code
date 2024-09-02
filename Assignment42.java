package assignmentpack5;
// WAP to find out average of an array of int data type whose size is 4?

public class Assignment42 {

	public static void main(String[] args) {
		// Our mystical array of integers
        int[] magicalArray = {10, 20, 30, 40};

        // The potion to calculate the average
        int sum = 0;
        for (int value : magicalArray) {
            sum += value;
        }

        double average = (double) sum / magicalArray.length;

        // The oracle speaks:
        System.out.println("Behold! The average of our magical array is: " + average);

	}

}
