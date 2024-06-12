package intermediate.collections.other;

import intermediate.collections.model.Account;
import intermediate.collections.model.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryExample {

    public static void main(String[] args) {
        // Collection Factory - You can declare collection frameworks without new keyword
        // Tradeoff, all of them is immutable
        List<Color> colors = List.of(
                Color.RED,
                Color.BLACK,
                Color.GREEN,
                Color.YELLOW
        );
        System.out.println(colors);
        // Can apply to Set.of(), Map.of()
        Set<Integer> immutableIntegerSet = Set.of(1, 2, 5, 8, 6);
        System.out.println(immutableIntegerSet);
        Map<Integer, User> userAssociateMap = Map.of(
                1, new User(1, "Mart", new Account(1001)),
                2, new User(2, "Silva", new Account(1002)),
                3, new User(5, "Peter", new Account(1003)),
                4, new User(9, "Jame", new Account(1004)),
                5, new User(8, "Poppy", new Account(1005))
        );
        System.out.println(userAssociateMap);
    }

    private enum Color {
        RED, BLACK, GREEN, YELLOW
    }
}
