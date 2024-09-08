package Variables;

public class TypeConversion {
    public static void main(String[] args) {

        // Implicit Conversion

        int number1 = 5;
        double number2 = number1;

        System.out.println(number2);

        // Explicit Conversion

        double number3 = 45.8;
        // int number4 = number3; // Results error;
        int number4 = (int)number3;
        System.out.println(number4);
        
    }
}
