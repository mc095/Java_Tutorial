package For_Loops;

public class forLoops1 {
   public static void main(String[] args) {
    
    // for(int i=1; i<=10; i++){
    //     System.out.print(i + " ");
    // }

    // 1 2 3 4 5 6 7 8 9 10 

    int numbers[] = {1,2,3,4,5,6,7,8,9,10};

    // for(int i=0; i<numbers.length; i++){
    //     System.out.print(numbers[i] + " ");
    // }
    // 1 2 3 4 5 6 7 8 9 10 

    // int sum = 0;
    // for(int i=0; i<numbers.length; i++){
    //     sum += numbers[i];
    // }

    // System.out.println("Sum: " + sum); // 55

    // int num = 5;

    // for(int i=1; i<=10; i++){
    //     System.out.printf("\n%d * %d = %d", num, i, num*i);
    // }

    /*  5 * 1 = 5
        5 * 2 = 10
        5 * 3 = 15
        5 * 4 = 20
        5 * 5 = 25
        5 * 6 = 30
        5 * 7 = 35
        5 * 8 = 40
        5 * 9 = 45
        5 * 10 = 50 */

        // nested for loop
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" " + j + " ");
        //     }
        //     System.out.print("\n");
        // }

        /*  1 
            1  2
            1  2  3
            1  2  3  4
            1  2  3  4  5 */

            // Even nums
            // for(int i=1; i<=10; i++){
            //     if(i%2 == 0){
            //         System.out.print(i + " ");
            //     }
            // }
            // 2 4 6 8 10 

            // printing primes in an array
            int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

            for(var it : arr){
                if(it % 2 == 0){
                    continue;
                }
                System.out.print(it + " ");
            }
            // 1 3 5 7 9 11 13 15 


   } 
}
