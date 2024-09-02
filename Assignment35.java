package assignmentpack4;

import java.util.Arrays;

// WAP to find the number of alphabets,numbers,spaces in a string


public class Assignment35 {

	public static void main(String[] args) {
		
		int count=0;
		String a="Ban ga lore 1 @";
		char[] input = a.toCharArray();
		System.out.println(Arrays.toString(input));
		
		for(int i=0; i<a.length(); i++)
		{
		boolean ans = Character.isAlphabetic(input[i]);
	    System.out.println(ans);
	    if (ans==true)
	    {
	    	count++;
	    }
		
		} 
		System.out.println(count);
		
		
		// numeric
		int count1=0;
		String a1="Ban ga lore 1 @";
		char[] input1 = a.toCharArray();
		for(int i=0; i<a.length(); i++)
		{
		boolean ans = Character.isDigit(input[i]);
	    System.out.println(ans);
	    if (ans==true)
	    {
	    	count++;
	    }
		
		} 
		System.out.println(count);
	}   
	
	
	
	

}
