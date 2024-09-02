package assignmentpack3;

import java.util.Arrays;

// Split the String word "Manish Kumar Tiwari"

public class Assignment30 {

	public static void main(String[] args) {
		
		String name="Manish Kumar Tiwari";
		String[] a = name.split(" ");
		System.out.println(Arrays.toString(a));
	    String[] name1 = name.split(" ",2);
	    System.out.println(Arrays.toString(name1));
		
		

	}

}
