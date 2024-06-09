package codingquestion.assignment.string;

public class ReverseEachWord {

    public static void main(String[] args) {
        // Assume input by paragraph - " " as a delimiter
        String input = "hello world test"; // Expect output: olleh dlrow tset
        String[] splitted = input.split(" ");
        String[] result = new String[splitted.length];
        for (int i = 0; i < result.length; i++) {
            String reversed = reverse(splitted[i]);
            result[i] = reversed;
        }
        System.out.println(String.join(" ", result));
    }

    private static String reverse(String word) {
        char[] arr = word.toCharArray();
        int left = 0;
        int right = arr.length -1;
        while (left <= right) {
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        return String.valueOf(arr);
    }
}
