package assignmentpack3;

// WAP on this()

public class Assignment29 {
	int age=10;
	String name="swdeddw";
	double salary=83345.56;
	
	void details(int age, String name, double salary)
	{
	   System.out.println(this.age=age);
		this.name=name;
		this.salary=salary;
		System.out.println("1");
	}

	public static void main(String[] args) {
		Assignment29 as=new Assignment29();
		System.out.println(as.age);
		System.out.println(as.salary);
		System.out.println(as.name);
		as.details(12, "sdedef", 44465767.67687889);
		

	}

}
