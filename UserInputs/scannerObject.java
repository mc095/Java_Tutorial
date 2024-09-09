package UserInputs;

import java.util.*;

public class scannerObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("What is your name? ");
        // creates a new line when printing

        System.out.print("What is your name? ");
        // doesnot create a new line when printing

        String name = scanner.nextLine();
        // nextLine() method is used to take string input from console

        System.out.println("My name is " + name);

        System.out.printf("Hello %s. How old are you? ", name);
        // formatted string method + prints new line

        // int age = scanner.nextInt();
        // taking input integer

        int age = Integer.parseInt(scanner.nextLine());

        // scanner.nextDouble(); - for double values
        // scanner.nextFloat(); - for float values

        // 20 <enter> enter will be left in the input buffer. so,
        
        // scanner.nextLine();

        System.out.printf("%d is an excellent age for Programming. What Language Do you prefer? ", age);
        String language = scanner.nextLine();

        // when the method (nextLine()) at 'language' was called, it sees the '<enter>' already
        // given by the nextInt() method at 'age'. so, it abruptly ends whatever the rest
        // input methods. 

        // So, this is an little issue. There are multiple ways to solve this!

        // 1. adding an extra nextLine() method right after nextInt() will cleans up buffer (ln. 33)
        // 2. Take all inputs as strings and change into desired dataTypes using "parse" methods.(ln. 26)
        // parsing syntax - Data_type.parse[Data_Type](scanner.nextLine());
        // double gpa = Double.parseDouble(scanner.nextLine());
        

        System.out.printf("%s is a very popular programming Language.", language);
        scanner.close();
    }
}
