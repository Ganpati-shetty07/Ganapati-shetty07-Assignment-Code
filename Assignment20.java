package assignmentpack1;
// Accept input from user and calculate Area of Rectangle formula (l*b

import java.util.Scanner;

public class Assignment20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a lenghth ");
		int l = s.nextInt();
		System.out.println("Enter a breadth ");
		int b=s.nextInt();
		int Area = l*b;
		System.out.println("Area of a rectangle 10 "+Area);
		

	}

}
