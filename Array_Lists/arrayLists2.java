package Array_Lists;

import java.util.*;
public class arrayLists2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums.toString()); // [1, 2, 3, 4, 5]

        nums.remove(4); // [1, 2, 3, 4]
        // remove(index_pos);

        nums.set(3, Integer.valueOf(3)); // [1, 2, 3, 3]
        // set(index_pos, data_type.valueOf(replacable_ele));

        ArrayList<Integer> nums2 = new ArrayList<Integer>(Arrays.asList(3,2,1,4,5));
        // defining a default arraylist values

        nums2.sort(Comparator.naturalOrder());
        // to sort an array list (ascending)

        nums2.sort(Comparator.reverseOrder()); // [5, 4, 3, 2, 1]
        // to sort an array list (descending)

        System.out.println(nums2.toString()); // [1, 2, 3, 4, 5]
        System.out.println(nums.toString());

        System.out.println(nums.contains(Integer.valueOf(1)));
        // check if array list contains an element or not. returns a boolean val

        System.out.println(nums2.isEmpty());
        // returns boolean

        nums2.clear();

        nums.forEach(it -> {
            System.out.print(it * 2 + " ");
        });
        // 2 4 6 6

        System.out.println(nums.toString());
        // [1, 2, 3, 3] (no change to original array)
    }
}
