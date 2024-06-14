package mostusedinterview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetForInterview {

    // HashSet -> Handling case of unique or duplicate detection
    // Most operation from HashSet -> O(1)
    public static void main(String[] args) {
        var input = List.of(7, 3, 4, 8, 1, 2, 7, 3, 4, 5, 7, 1, 3, 8);
        Set<Integer> integerSet = new HashSet<>(input);
        // Remaining unique element
        System.out.println(integerSet);

        System.out.println(STR."isContainDuplicate: \{isContainDuplicate(input)}");
    }

    private static boolean isContainDuplicate(List<Integer> input) {
        boolean isDuplicate = false;
        Set<Integer> seen = new HashSet<>();
        for (var n : input) {
            if (seen.contains(n)) {
                return true;
            }
            seen.add(n);
        }
        return isDuplicate;
    }
}
