package fundamentals;

import java.util.Arrays;
import java.util.Collections;

public class ArrayFocus {

    /*
    * Array
        - Group of same type of element
        - Reserve memory in sequence
        - Store element on same use-case
          together
        - Array in Java is reference
    * */
    public static void main(String[] args) {
        // If you want to declare like below example - Reserve number of slots
        // Initialized with size
        // 0 - 9 = size 10
        int[] numbers = new int[10];
        numbers[5] = 10; // Assign value to index
        System.out.println(numbers[5]); // Access value by index

        // Combined old array initialization with assign value
        int[] exampleArray1 = new int[]{5, 2, 3, 4}; // size = 4
        System.out.println(exampleArray1[2]);

        // Declare array with value
        String[] names = {"Mart", "Caroll", "James", "Peter"};
        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("======");
        int[] exampleToShowUtility = {4, 7, 5, 8, 9, 6, 3, 2, 1};
        Arrays.sort(exampleToShowUtility); // Ascending order
        System.out.println(Arrays.toString(exampleToShowUtility));
        // Descending order - primitive array
        reverse(exampleToShowUtility);
        System.out.println(Arrays.toString(exampleToShowUtility));
        // Use stream API
        exampleToShowUtility = new int[]{4, 7, 5, 8, 9, 6, 3, 2, 1};
        int[] descResult = Arrays.stream(exampleToShowUtility)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(descResult));
    }

    private static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
}
