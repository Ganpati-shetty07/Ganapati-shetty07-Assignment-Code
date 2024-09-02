package assignmentpack1;

import java.util.Scanner;

// Accept number from user and calculate Area of circle (formula πr square, PI=3.14) 

public class Assignment17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a radius of a circle");
		int r = s.nextInt();
		System.out.println("Enter a pi value");
		float pi = s.nextFloat();
        float area=pi*r*r;
        System.out.println("The area of a circle "+area);
	
		

	}

}
