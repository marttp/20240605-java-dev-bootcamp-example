package intermediate.collections.set;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // TreeSet - Set that enable to search lower/greater
        TreeSet<Integer> setOfInteger = new TreeSet<>();
        setOfInteger.add(22);
        setOfInteger.add(82);
        setOfInteger.add(86);
        setOfInteger.add(1);
        setOfInteger.add(5);

        System.out.println(setOfInteger); // Sorted result
        System.out.println(setOfInteger.ceiling(20)); // 22
        System.out.println(setOfInteger.floor(20)); // 5
    }
}
