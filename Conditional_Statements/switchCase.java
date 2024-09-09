package Conditional_Statements;

import java.util.*;
public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How is the weather today? (Sunny/Rainy/Cold) ");
        String temp = scanner.nextLine();

        switch(temp) {
            case "Sunny":
                System.out.println("Bring your water bottle!");
                break;
            case "Rainy" :
                System.out.println("Take your umbrella with you!");
                break;
            case "Cold":
                System.out.println("Dont forget your hoodie!");
                break;
            default:
                System.out.println("Feed the Cat's bowl");
        }

        scanner.close();
    }
}
