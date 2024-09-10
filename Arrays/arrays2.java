package Arrays;

import java.util.*;
public class arrays2 {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};

         // int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
         // [1, 2, 3, 4, 5]

        // if you make changes to the original array,
        // copy of the array also will be changed.

        // int copyOfNumbers[] = numbers;

        // Arrays.fill(numbers, 0);

        // System.out.println(Arrays.toString(numbers));

        // [0, 0, 0, 0, 0]
        // [0, 0, 0, 0, 0]

        // so this issue, can be solved using
        // Arrays.copyOf(arr, size_of_arr);

        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

        // Arrays.fill(numbers, 0);

        // [0, 0, 0, 0, 0]
        // [1, 2, 3, 4, 5]

        int newCopyArr[] = Arrays.copyOfRange(copyOfNumbers, 2, 4);
        // [3, 4]

        // int newCopyArr[] = Arrays.copyOfRange(copyOfNumbers, 2, 10);
        // [3, 4, 5, 0, 0, 0, 0, 0]

        // System.out.println(Arrays.toString(numbers));
        // System.out.println(Arrays.toString(copyOfNumbers));
        // System.out.println(Arrays.toString(newCopyArr));
        
        System.out.println(numbers == copyOfNumbers); // false
        System.out.println(Arrays.equals(numbers, copyOfNumbers)); // true
    }
}
