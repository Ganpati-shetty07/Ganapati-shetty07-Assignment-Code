package assignmentpack1;
// Accept input from user and calculate Area of Triangle(formula - (b*h)/2

import java.util.Scanner;

public class Assignment19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a breadth number");
		int b = s.nextInt();
		System.out.println("Enter a height number");
		int h = s.nextInt();
	    int Area = b*h/2;
	    System.out.println(Area);
	    
		
		

	}

}
