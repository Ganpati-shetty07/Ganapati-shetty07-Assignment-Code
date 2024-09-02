package assignmentpack3;
class Amazon
{
	void add()
	{
		System.out.println("1");
	}
}

  class flipkart extends Amazon
  {
	  void sub()
	  {
		  System.out.println("2");
	  }
  }

public class Assignment26 extends flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment26 a=new Assignment26();
		a.add();
		a.sub();
		

	}

}
