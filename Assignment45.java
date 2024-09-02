package assignmentpack5;
// WAP to check if given 2 strings are anagram of each other 

import java.util.Arrays;

public class Assignment45 {

	public static void main(String[] args) {
		

		String a="face";
		String b="cafe";
		
		if(a.length()!=b.length())
		{
			System.out.println("not anagram");
		}
		else
		{
			char[] c1=a.toCharArray();
			char[] c2=a.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			boolean ans = Arrays.equals(c1, c2);
			System.out.println(ans);
			if(ans==true)
			{
				System.out.println("it is anagram");
			}
			else
			{
				System.out.println("it is not a anagram");
			}
		}
		

	}

}
