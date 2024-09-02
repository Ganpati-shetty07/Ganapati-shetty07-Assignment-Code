package assignmentpack;
//WAP on method overloading
public class Assignment4 {
    
	static void add()
	{
		System.out.println("1");
	}
	static void add(int a)
	{
		System.out.println("2");
	}
	void add(int a,int b)
	{
		System.out.println("3");
	}
	void add(int a ,String b)
	{
		System.out.println("4");
	}
	public static void main(String[] args) {
		
         add();
         add(2);
         Assignment4 a=new Assignment4();
         a.add(2, 4);
         a.add(4, 6);
         
	}

}
