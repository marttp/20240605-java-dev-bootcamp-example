package codingquestion.assignment.array;

public class IsTheArraySorted {

    void main() {
        // Assume every element is unique
        int[] expectedTrue = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(STR."Result: \{isAscSorted(expectedTrue)}");
        int[] expectedFalse = {1, 2, 3, 4, 6, 5, 7, 8, 9};
        // next > previous
        System.out.println(STR."Result: \{isAscSorted(expectedFalse)}");
    }

    private static boolean isAscSorted(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return true;
        }
        // Assume right now we have more than 2 elements
        // index - [0,1,...,n]
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = arr[i - 1];
            if (current < previous) {
                return false;
            }
        }
        return true;
    }
}
