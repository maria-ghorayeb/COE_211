import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        /**
         * Enjoy <3
         */
        int userNb;
        String nour="";
        Scanner scanny = new Scanner(System.in);

        do {
        System.out.println("Which service would you like to use?" +"\n" + "[1]: Basic week visualizer" + "\n" + "[2]: Advanced week visualizer"+"\n"+"[3]: Basic calculator" + "\n" + "[4]: Employee repertoire");
        do{
        userNb = scanny.nextInt();
        scanny.nextLine();
        if (userNb < 1 || userNb >4) {
        	System.out.println("Please make sure you pick a number between 1 and 4");
        }
    	}while (userNb < 1 || userNb >4);
   		


        switch(userNb){
        	case 1 :
        		BasicWeek week1 = new BasicWeek();
        		week1.printDays();
        		break;
        	case 2 : 
        		AdvancedWeek week2 = new AdvancedWeek();
        		week2.printDays();
        		break;
        	case 3 : 
        		Calculator myCalc = new Calculator();
        		break;
        	case 4 :
        		Employee newEmployee = new Employee();
        		System.out.println(newEmployee);
        		break;
        }
        System.out.println("Would you like to perform another operation? (y/n)");
        nour = scanny.nextLine();
        	
    } while (nour.equals("y"));
        
}
}