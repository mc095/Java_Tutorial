package Operators;

public class assignmentOperators {
    public static void main(String[] args) {
        int num = 5;

        num = num + 5; // 10
        // num += 5;
        // num -= 5;
        // num %= 5;
        System.out.println(num);

        num++; // 11
        System.out.println(num);

        ++num; // 12
        System.out.println(num);

        num--; // 11
        System.out.println(num);

        --num; // 10
        System.out.println(num);

        System.out.println(num); // 10
    }
}
