package codingquestion.assignment.array;

public class PalindromeNumberChecker {

    void main() {
        // Concept - Read backward & forward same
        int[] expectedTrue1 = {1, 2, 3, 3, 2, 1};
        System.out.println(STR."expectedTrue1: \{isPalindrome(expectedTrue1)}");
        int[] expectedTrue2 = {1, 2, 3, 2, 1};
        System.out.println(STR."expectedTrue2: \{isPalindrome(expectedTrue2)}");
        int[] expectedFalse = {1, 2, 3, 8, 7, 3, 2, 1};
        System.out.println(STR."expectedFalse: \{isPalindrome(expectedFalse)}");
    }

    private static boolean isPalindrome(int[] arr) {
        for (int left = 0, right = arr.length - 1; left <= right; left++, right--) {
            if (arr[left] != arr[right]) {
                return false;
            }
        }
        return true;
    }
}
