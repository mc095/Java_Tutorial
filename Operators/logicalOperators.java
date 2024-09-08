package Operators;

public class logicalOperators {
    public static void main(String[] args) {
        
        int age = 24;

        System.out.println(age >= 18 && age <= 50); // true

        System.out.println(age >= 18 || age <= 50); // true

        System.out.println(!(age == 24)); // false
    }
}
