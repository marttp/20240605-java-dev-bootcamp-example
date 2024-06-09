package codingquestion.assignment.array;

import java.util.Arrays;

public class MedianOfArray {

    void main() {
        int[] example1 = {5, 7, 8, 6, 3}; // Expect: 6
        System.out.println(STR."Result: \{findMedian(example1)}");
        int[] example2 = {5, 7, 8, 6, 3, 1}; // Expect: 5.5
        System.out.println(STR."Result: \{findMedian(example2)}");
        int[] example3 = {5};// Expect: 5
        System.out.println(STR."Result: \{findMedian(example3)}");
        int[] example4 = new int[]{}; // Expect: 0
        System.out.println(STR."Result: \{findMedian(example4)}");
    }

    private static double findMedian(int[] arr) {
        int length = arr.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return arr[0];
        }
        Arrays.sort(arr);
        boolean isEven = length % 2 == 0;
        if (isEven) {
            return (arr[length / 2] * 0.5) + (arr[(length / 2) - 1] * 0.5);
        }
        return arr[length / 2];
    }
}
