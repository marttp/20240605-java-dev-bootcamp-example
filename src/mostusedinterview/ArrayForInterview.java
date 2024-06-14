package mostusedinterview;

import java.util.Arrays;
import java.util.List;

public class ArrayForInterview {

    public static void main(String[] args) {
        // T[] variableName = new T[N] // T: data type, N: static size
        // array of primitive -> value is default
        // array of reference type -> value initial by null
        int[] data = new int[20];
        System.out.println(Arrays.toString(data));
        // Manipulate -> index
        int index = 0;
        data[index] = 5; // O(1)
        System.out.println(Arrays.toString(data));

        String[] names = {"Mart", "TP", "Coder"};
        System.out.println(names.length);

        int[] data2 = new int[20];
        Arrays.fill(data2, 1);
        System.out.println(Arrays.toString(data2));

        int[] numbers = new int[8];
        numbers[0] = 5;
        numbers[1] = 9;
        numbers[2] = 4;
        numbers[3] = 2;
        numbers[4] = 1;
        numbers[5] = 0;
        numbers[6] = 7;
        numbers[7] = 8;
        System.out.println("==Before Sort==");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers); // O(n log(n))
        System.out.println("==After Sort==");
        System.out.println(Arrays.toString(numbers));
        // DESC -> Primitive -> reverse by ourselves
        var numbersBoxType = Arrays.stream(numbers)
                .boxed()
                .toList()
                .toArray(new Integer[0]);
        Arrays.sort(numbersBoxType, (a, b) -> Integer.compare(b, a));
        System.out.println(Arrays.toString(numbersBoxType));
    }
}
