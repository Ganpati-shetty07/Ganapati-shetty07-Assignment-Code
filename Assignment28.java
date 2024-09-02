package assignmentpack3;

// WAP on super keyword (method overriding)

class Gclass
{
	void login()
	{
		System.out.println("Login with email");
	}
}

class Pclass extends Gclass
{
	void login()
	{
		super.login();
		System.out.println("Login with phone");
		
	}
}

public class Assignment28 extends Pclass {

	public static void main(String[] args) {
		Assignment28 as=new Assignment28();
		as.login();
		
		
		

	}

}
