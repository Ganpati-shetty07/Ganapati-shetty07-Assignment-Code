package assignmentpack1;

import java.util.Scanner;

//  Accept number from user and Write a program to check Number is even or odd by using if else statement 

public class Assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter a number");
		int no = s.nextInt();
		if(no%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
		
		

	}

}
