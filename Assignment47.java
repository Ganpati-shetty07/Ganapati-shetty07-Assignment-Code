package assignmentpack5;

// WAP with an Array of size 4, enter five values in it and handle the Exception?

public class Assignment47 {

	public static void main(String[] args) {
		
		int[] arr=new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
	try {
		arr[4]=5;
	}
	catch(ArrayIndexOutOfBoundsException a)
	{
	   System.out.println("Handled the expection");	
	}

	}

}
