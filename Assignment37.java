package assignmentpack4;

import java.util.Arrays;

// WAP to check if the two Arrays are equals to each other

public class Assignment37 {

	public static void main(String[] args) {

		int rollno[]=new int[4];
		 int rollno1[]=new int[4];
		 
		 rollno[0]=1;
		 rollno[1]=2;
		 rollno[2]=3;
		 rollno[3]=4;
		 
		 rollno1[0]=1;
		 rollno1[1]=2;
		 rollno1[2]=3;
		 rollno1[3]=4;
		 
		boolean array = Arrays.equals(rollno, rollno1);
		System.out.println(array);

	}

}
