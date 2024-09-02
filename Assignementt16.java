package assignmentpack1;

import java.util.Scanner;

// Accept two numbers from user and perform all the Arithmetic operations(+,-, *, /, %)

public class Assignementt16 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a first number");
	int a1 = s.nextInt();
	System.out.println("Enter a second number");
	 int b1 = s.nextInt();
	 int sum = a1+b1;
	 System.out.println("The sum of 2 numbers "+sum);
	 int sub = b1-a1;
	 System.out.println("The subtraction of 2 numbers "+sub);
	 int mul=a1*b1;
	 System.out.println("The multiplication of 2 numbers "+mul);
	 int div=b1/a1;
	 System.out.println("The divison of 2 numbers "+div);
	 
	 
	 
	 
	
	
	}

}
