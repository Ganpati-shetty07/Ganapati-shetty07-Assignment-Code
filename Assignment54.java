package assignmentpack6;
// WAP to showcase the Compile Time Polymorphism

public class Assignment54 {
	
	 void show(int num1)
	    {
	        System.out.println("number 1 : " + num1);
	    }

	    // 2 parameter
	    void show(int num1, int num2)
	    {
	        System.out.println("number 1 : " + num1
	                           + "  number 2 : " + num2);
	    }

	    public static void main(String[] args)
	    {
	        Assignment54 obj = new Assignment54();
	      
	          // 1st show function
	        obj.show(3); 
	      
	          // 2nd show function
	        obj.show(4, 5); 
	}

}
