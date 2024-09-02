package assignmentpack6;
// WAP to find out current time and current date?

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Assignment58 {

	public static void main(String[] args) {
		 // The oracle reveals the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // The ancient clock chimes the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        // The cosmic conjunction reveals both date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);
       
        
        
        
        
        
        
        

	}

}
