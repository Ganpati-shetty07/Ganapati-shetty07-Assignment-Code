package assignmentpack;
//   WAP on contructor overloading

public class Assignment5 {
	
	Assignment5()
	{
		System.out.println("1");
	}
	Assignment5(int a)
	{
		System.out.println(a);
	}
	Assignment5(int a, String b)
	{
		System.out.println("3");
	}
	Assignment5(String b, int a)
	{
		System.out.println("4");
	}

	public static void main(String[] args) {
		
		
         new Assignment5();
         new Assignment5(3);
         new Assignment5("age",4);
         new Assignment5(3,"age");
         
         
	}

}
