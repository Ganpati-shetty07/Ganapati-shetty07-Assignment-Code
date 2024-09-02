package assignmentpack3;
// Accept input from user and calculate area of trapezium(formula -> 1/2*(a+b)*h

import java.util.Scanner;

public class Assignment24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		int a = s.nextInt();
		System.out.println("Enter b value");
		int b = s.nextInt();
		System.out.println("Enter h value");
		int h = s.nextInt();
		float Area = 1/2*(a+b)*h;
		System.out.println("Area of a trapezium "+Area);
		
		//  output is wrong 
		
		

	}

}
