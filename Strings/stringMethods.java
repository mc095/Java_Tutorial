package Strings;

public class stringMethods {
    public static void main(String[] args) {
        
        String name = "Ganesh";
        System.out.println(name.length()); // 6
        // length() return number of char in a String

        System.out.println(name.isEmpty()); // false
        // isEmpty() checks if string is empty or not

        System.out.println(name.toUpperCase()); // GANESH
        // toUpperCase() returns every char in uppercase, doesn't changes original String
        System.out.println(name); // Ganesh

        System.out.println(name.toLowerCase()); // ganesh
        // toLowerCase() returns every char in lowercase, doesn't changes original String
        System.out.println(name); // Ganesh



        String string1 = new String("abc");
        String string2 = new String("abc");

        System.out.println(string1 == string2); // false (not same object even though strings are same)

        System.out.println(string1.equals(string2)); // true

        String string3 = new String("ABC");
        System.out.println(string1.equals(string3)); // false (values are not same)

        // ignoring case sensitivity
        System.out.println(string1.equalsIgnoreCase(string3)); // true


        // Replacing a part of String in Java
        String string = "The Sky is Blue.";
        System.out.println(string.replace("Blue", "Red"));
        // doesn't change the original String
        System.out.println(string);

        String updatedString = string.replace("Blue", "Red");
        System.out.println(updatedString);

        // Check if string contains a word or not
        System.out.println(string.contains("Blue")); // true

    }
}
