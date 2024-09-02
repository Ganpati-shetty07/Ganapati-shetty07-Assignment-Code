package assignmentpack5;

import java.util.Scanner;

// Take size from scanner class n get two exception one for nextInt other for ArrayOutOfBoundException Handled it using try catch

public class Assignment48 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		try
		{
		s.nextInt();
		}
		catch(java.util.InputMismatchException a)
		{
			System.out.println("Handled the exception");
		}
	    catch(ArrayIndexOutOfBoundsException w)
		{
	    	System.out.println("handled the exception for array");
		}
	    int[] arr=new int[2];
		System.err.println("Enter a first number ");
	    arr[0]=s.nextInt();
	    System.err.println("Enter a second number ");
	    arr[1] =  s.nextInt();
	    System.err.println("Enter a Third number ");
	    arr[2] =   s.nextInt();

	    

	}

}
