import java.util.Scanner;
public class Skeleton {
    
	public static void main(String[] args) {
  
      
	// Initialize array of integers

 
	int[] assignments = new int[5];
	int counter;
	double labs, midterm;
	double sum = 0;
	double assignmentResult;
	Scanner scan = new Scanner(System.in);

	// for loop to get user input & store in array


	for(counter = 0; counter<assignments.length; counter++){
		System.out.println("Input the grade of assignment "+(counter+1));
		assignments[counter] = scan.nextInt();
	}
	System.out.println("Input the number of attended labs.");
	labs = scan.nextDouble();
	System.out.println("Input the midterm grade.");
	midterm = scan.nextDouble();

	// for loop to iterate over the array & perform calculations

   
	for(counter = 0; counter<assignments.length; counter++){
		sum+= assignments[counter];
	}
	assignmentResult = (sum/5.0)*0.3;
	labs = (labs/7.0)*100*0.05;
	midterm = midterm*0.3;

	  
	// display output to user
    
	System.out.println("Assignments (30%): " + assignmentResult);
	System.out.println("Attendance (5%): " + labs);
	System.out.println("Midterm (30%): " +midterm);
	

	}

}