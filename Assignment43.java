package assignmentpack5;
// WAP on abstraction(try to write logic inside method)

//import javaclasses6.Grand_Parent;

abstract class Grand_Parent                                              //  abstract class
{
	abstract void add();
	void add1() {
		// TODO Auto-generated method stub
		
	}
	abstract void subtract();
	
}
class Parent extends Grand_Parent                                                // concrete class
{
	void add()
	{
		System.out.println("1");
	}
	void sub()
	{
		System.out.println("2");
	}
	@Override
	void add1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void subtract() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class Assignment43 {

	public static void main(String[] args) {
		

	}

}
