import java.util.Scanner ;
public class EntryPoint {
	public static void main (String[] args) {
		String firstName, lastName ; 
		int age;
		double monthSalary;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input the employee's first name: ");
		firstName = scan.nextLine();
		
		System.out.println("Please input the employee's last name: ");
		lastName = scan.nextLine();

		System.out.println("Please input the employee's age: ");
		age = scan.nextInt();

		System.out.println("Please input the employee's monthly salary: ");
		monthSalary = scan.nextDouble();

		Employee myEmployee = new Employee (firstName, lastName, age, monthSalary);

		System.out.println ("Employee information: " + myEmployee.firstName + " " + myEmployee.lastName + ", " + myEmployee.age + ", " + myEmployee.monthSalary );

	}
}
