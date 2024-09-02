package assignmentpack3;

// WAP on super()

 class flip
 {
	 flip(String a)
	 {
		 System.out.println("1");
	 }
 }
 
 class Myntra extends flip
 {
	 Myntra()
	 {
		 super("sded");
		 System.out.println("2");
	 }
 }

public class Assignment27 extends Myntra {

	public static void main(String[] args) {
		
		new Assignment27();
		
		

	}

}
