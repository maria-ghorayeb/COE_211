
import java.io.FileWriter;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.*;
import java.util.Scanner;

public class ExpensesTracker{
	public static void main(String[] args) throws IOException{
	// Create FileWriter & Scanner objects & y/n string
	FileWriter fw = new FileWriter(new File("expenses.txt"));
	BufferedWriter bw = new BufferedWriter(fw);
	PrintWriter outToFile = new PrintWriter(bw);
	Scanner scan = new Scanner(System.in);
	String name, purchase;
	double price;
	String repeat;

	// Start gathering information inside the loop you will start
	System.out.println("Input your name: ");
	name = scan.nextLine();
	
	do{
	System.out.println("What did you purchase? ");
	purchase = scan.nextLine();
	System.out.println("How much did you pay? (in USD) ");
	price = scan.nextDouble();
	scan.nextLine();
	outToFile.println( name + " purchased " + purchase + " for " + price + " US Dollars.");
	
	
	System.out.println("Would you like to log another purchase? (y/n)");
	repeat = scan.nextLine();
	}while(repeat.equalsIgnoreCase("y"));
	
	if(repeat.equalsIgnoreCase("n")) {
		System.out.println("Get off of ZoodMall!");
	
	}
																		
	// Close ClassWriter & Scanner objects
	outToFile.close();
	scan.close();
        
        	// If you have already have a expenses.txt file, you need to delete it
	// before you compile your code again

	}
}