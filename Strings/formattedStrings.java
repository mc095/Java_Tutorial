package Strings;

public class formattedStrings {
    public static void main(String[] args) {
        // Strings in java are Object DataType

        String name = "Ganesh"; // %s
        String country = "India";
        int age = 20; // %d
        String company = "HCL";
        double gpa = 3.8; // floats and doubles - %f
        char percentSign = '%'; // %c
        boolean amiTellingtheTruth = false; // %b

        // System.out.println("Hello world!, I am Ganesh. I am from India. I am 20 years old");
        // System.out.println("Hello world!, I am " + name + ". I am from" + country + ". I am " + age 
        // + " years old. I work for " + company +"." );


        String formattedString = String.format("My name is %s. I am from %d years old. " + 
                                                "\nI work for %s. my gpa is %f. " +
                                                "\nMy percentage is 87%c of my university classes. " +
                                                "\nThese are all %b claims.", name, age, company, gpa, percentSign, amiTellingtheTruth);
        System.out.println(formattedString);
    }
}
