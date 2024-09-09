package Strings;

public class string {
    public static void main(String[] args) {
        // String myName = "Ganesh";
        // String myName = new String("Ganesh");
        // System.out.println(myName);


        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        System.out.println(literalString1 == literalString2); //true
        System.out.println(objectString1 == objectString2); //false

        // when declaring a new string using literal format, the value "abc" was
        // already present in the string pool that jvm actually reused the older
        // value with literalString2. When using the new keyword, the same value has
        // been assigned to the two sting variables, they are not same
    }
}
