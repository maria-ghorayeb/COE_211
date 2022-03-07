import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    private int result;
    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        System.out.printl("Input the first number: ");
        num1 = scanCalc.nextInt();
        scan.nextLine();
        System.out.println("Input the operator: ")
        operator = scanCalc.nextLine();
        System.out.println("Input the second number: ")
        num2 = scanCalc.nextInt();

        scanCalc.close();
        // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
        
        switch(operator){
            case "+" :
                System.out.println(add(num1, num2));
                break;
            case "-" :
                    System.out.println(substract(num1, num2));
                    break;
            case "*":
                    System.out.println(multiply(num1, num2));
                    break;
            case "/" :
                    System.out.println(divide(num1, num2));
                    break;

        }
    }

    public String add(int a, int b) {
        result = a + b;
        return a + "+" + b + "=" + result;
         
    }

    public String subtract(int a, int b) {
        result = a - b;
        return a + "-" + b + "=" + result;
    }

    public String multiply(int a, int b) {
        result = a * b;
        return a + "x" + b + "=" + result;
    }

    public String divide(int a, int b) {
        result = a / b;
        return a + "/" + b + "=" + result;
    }
}