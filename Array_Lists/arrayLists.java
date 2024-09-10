package Array_Lists;

import java.util.*;
public class arrayLists {
    public static void main(String[] args) {
        
        int n = 10;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>(n);

        // using wrapper classes of primitive types, 
        // we can use them as reference types.

        System.out.print("Enter the Array (10): ");
        for(int i=0; i<n; i++){
            num.add(scanner.nextInt());
        }

        System.out.println("Array is: ");
        for(var it : num){
            System.out.print(it + " ");
        }

        scanner.close();
    }
}
