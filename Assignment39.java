package assignmentpack4;

// In an Array of int data type of size four the values are 100,200, 300 and 400.Check if the given number is a part of Array or not?

public class Assignment39 {

	public static void main(String[] args) {
		int[] ancientArray = {100, 200, 300, 400};

        // The number we seek (you may replace this with any other number)
        int desiredNumber = 300;

        // Let us consult the array oracles
        boolean isPresent = false;
        for (int value : ancientArray) {
            if (value == desiredNumber) {
                isPresent = true;
                break; // We've found it! No need to continue the quest.
            }
        }

        // The prophecy unfolds
        if (isPresent) {
            System.out.println("Hark! The number " + desiredNumber + " resides within our array.");
        } else {
            System.out.println("Alas! The number " + desiredNumber + " eludes our grasp.");
        }
	}

}
