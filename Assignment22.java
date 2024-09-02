package assignmentpack3;
// Accept input from user and calculate Circum ference of Triangle formula a+b+c

import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      System.out.println("enter a value");
     int a = s.nextInt();
     System.out.println("enter b value");
     int b = s.nextInt();
     System.out.println("enter c value");
     int c = s.nextInt();
     int Area = a+b+c;
     System.out.println("circumference of a triangle "+Area);
	}

}
