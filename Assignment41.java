package assignmentpack5;

// WAP on abstraction(try to write logic inside method)

public class Assignment41 {

	public static void main(String[] args) {
		// Our original array with magical values
        int[] mysticalArray = {10, 20, 30, 40, 50};

        // The spell to reverse the array
        int left = 0;
        int right = mysticalArray.length - 1;

        while (left < right) {
            // Swap the elements at left and right indices
            int temp = mysticalArray[left];
            mysticalArray[left] = mysticalArray[right];
            mysticalArray[right] = temp;

            // Move the pointers toward each other
            left++;
            right--;
        }

        // Behold! The reversed array emerges from the mist:
        System.out.println("Reversed Array:");
        for (int value : mysticalArray) {
            System.out.print(value + " ");
        }

	}

}
