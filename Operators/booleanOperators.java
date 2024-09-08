package Operators;

public class booleanOperators {
    public static void main(String[] args) {
        
        boolean isStudent = true;
        boolean isLibraryMember = false;
        boolean isGood = true;

        System.out.println(isStudent && isLibraryMember);
        // false

        System.out.println(isLibraryMember || isGood);
        // true

        System.out.println(!(isGood));
        // false
    }
}
