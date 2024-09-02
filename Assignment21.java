package assignmentpack3;

import java.util.Scanner;

// Accept input from user and calculate Circumference of circle formula  2*pi*r

public class Assignment21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a radius");
		int r = s.nextInt();
		System.out.println("enter a pi value");
		float pi=s.nextFloat();
		float Area=2*pi*r;
		System.out.println("Area of circumference of a circle "+Area);
		

	}

}
