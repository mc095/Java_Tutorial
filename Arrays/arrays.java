package Arrays;

import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        // Arrays are Reference type just like Strings

        // Array syntax in Java :
        // data_type array_name[] = new data_type[size_of_array];
        // char vowels[] = new char[5];
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};

        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        // for(var it : vowels){
        //     System.out.print(it + " ");
        // }
        // a e i o u

        // Changing values
        vowels[2] = 'x';

        // other way
        System.out.println(Arrays.toString(vowels));
        // [a, e, i, o, u]

        System.out.println(vowels.length);
        // length returns no. of elemnts in array

        int nums[] = {4,5,1,3,2};

        Arrays.sort(nums);
        // Sort in a range Arrays.sort(arr, s_idx, e_idx);
        Arrays.sort(nums, 1, 4);

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        // Searching an element in an array (only in sorted arrays)
        // Arrays.binarySearch(arr, key_value);
        int foundItemIndex = Arrays.binarySearch(nums, 5);

        // Search in range(arr, s_idx, e_idx, key);
        // int foundItemIndex = Arrays.binarySearch(nums, 1, 4, 2);
        
        // if search fails returns a negative value

        System.out.println(foundItemIndex);

        // Arrays.fill(arr_name, fill_element)
        Arrays.fill(nums, 5);
        // [5, 5, 5, 5, 5]

        // (fromIndex, toIndex, val)
        Arrays.fill(nums, 2, 4, 5);
        // [4, 5, 5, 5, 2]

        System.out.println(Arrays.toString(nums));
    }
}