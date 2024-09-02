package assignmentpack3;
// Accept input from user and calculate Circumference of Rectangle formula 2*(a+b)

import java.util.Scanner;

public class Assignment23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a length");
		int a = s.nextInt();
		System.out.println("Enter a breadth");
		int b = s.nextInt();
		int Area = 2*(a+b);
		System.out.println("circumference of a rectangle "+Area);
		
		

	}

}
