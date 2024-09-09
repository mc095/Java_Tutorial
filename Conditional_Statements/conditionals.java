package Conditional_Statements;

import java.util.*;
public class conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number - 1: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter Number - 2: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.print("What Operation do you want to perform (String)? \n1. Addition\n2. Subtraction" + 
                            "\n3. Multiplication\n4. Division\n\n");
        String operation = scanner.nextLine();

        if(operation.equalsIgnoreCase("Addition")){
            System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
        } else if (operation.equalsIgnoreCase("Subtraction")){
            System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1 - num2);
        } else if(operation.equalsIgnoreCase("Multiplication")){
            System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1 * num2);
        } else if(operation.equalsIgnoreCase("Division")){
            if(num2 != 0) {
                System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1 / num2);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Try again, Bye!");
        }

        scanner.close();
    }
}
