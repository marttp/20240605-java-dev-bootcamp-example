package intermediate.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        // Set - Unique value purpose
        Set<Integer> setOfInteger = new HashSet<>();
        setOfInteger.add(22);
        setOfInteger.add(82);
        setOfInteger.add(86);
        setOfInteger.add(1);
        setOfInteger.add(5);
        setOfInteger.add(82);
        setOfInteger.add(86);

        System.out.println(setOfInteger); // Example: [1, 82, 5, 22, 86] - Unorder

        // O(1)
        if (setOfInteger.contains(6)) {
            System.out.println("Set contain 6");
        } else {
            System.err.println("Set not contain 6");
        }
    }
}
