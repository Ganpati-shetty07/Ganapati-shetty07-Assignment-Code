package assignmentpack6;
// WAP to showcase the Encapsulation using Int data type

public class Assignment57 {

	public static void main(String[] args) {
		
		class Person {
		    // Encapsulating the name and age
		    // only approachable and used using
		    // methods defined
		    private String name;
		    private int age;
		 
		    public String getName() { return name; }
		 
		    public void setName(String name) { this.name = name; }
		 
		    public int getAge() { return age; }
		 
		    public void setAge(int age) { this.age = age; }
		}
		 
		// Driver Class
		
		    // main function
		    
		        // person object created
		        Person person = new Person();
		        person.setName("John");
		        person.setAge(30);
		 
		        // Using methods to get the values from the
		        // variables
		        System.out.println("Name: " + person.getName());
		        System.out.println("Age: " + person.getAge());
		    }
		
	}

