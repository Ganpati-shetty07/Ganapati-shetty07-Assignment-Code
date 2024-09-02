package assignmentpack6;
//  both Parent and child class has 2 nonstatic and 2 static methods. do up casting a$nd down casting

class Parent
{
	static void login()
	{
		System.out.println("login with email");
	}
	
	void register()
	{
		System.out.println("login with phonne");
	}
}

public class Assignment51 extends Parent{
	
	void login1(int a)
	{
		System.out.println("login with yahoo");
	}
    static void register1()
    {
    	System.out.println("login with facebook");
    }
	public static void main(String[] args) {
		
		Parent p	=new Assignment51();
		p.login();
		p.register(); // upcasting 
		
		Assignment51 a= (Assignment51) p; // downcasting
		a.login1(5);
		a.login();
		a.register1();
		a.register();
		
		
		

	}

}
