package While_loops;

import java.util.*;
public class whileLoops1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the array: ");
        int arr[] = new int[n];

        int i = 0;
        while(i < n){
            arr[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }

        for(var it : arr){
            System.out.print(it + " ");
        }

        scanner.close();
    }
}