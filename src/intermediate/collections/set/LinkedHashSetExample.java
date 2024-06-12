package intermediate.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        // LinkedHashSet - maintained order of element based on add order
        Set<Integer> setOfInteger = new LinkedHashSet<>();
        setOfInteger.add(22);
        setOfInteger.add(82);
        setOfInteger.add(86);
        setOfInteger.add(1);
        setOfInteger.add(5);
        setOfInteger.add(82);
        setOfInteger.add(86);

        System.out.println(setOfInteger); // Example: [22, 82, 86, 1, 5] Ordered result
    }
}
