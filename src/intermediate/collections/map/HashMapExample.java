package intermediate.collections.map;

import intermediate.collections.model.Account;
import intermediate.collections.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {

    private static final String ODD = "ODD";
    private static final String EVEN = "EVEN";

    public static void main(String[] args) {
        hashMapBasic();
        hashMapAdapt();
    }

    private static void hashMapBasic() {
        // 1 - 20 -> Grouping odd, even
        // <K, V> => What type of key & value?
        // Example design => { "ODD": [1,3,5,7,...], "EVEN": [2,4,6,8,...]}
        Map<String, List<Integer>> grouping = new HashMap<>();
        // Initial value
        grouping.put(ODD, new ArrayList<>());
        grouping.put(EVEN, new ArrayList<>());

        for (int n = 1; n <= 20; n++) {
            if (n % 2 == 0) {
                grouping.get(EVEN).add(n);
            } else {
                grouping.get(ODD).add(n);
            }
        }

        System.out.println(grouping);
    }

    private static void hashMapAdapt() {
        // UserId -> Account?
        Map<Long, Account> userIdMapAccount = new HashMap<>();
        List<User> users = List.of(
                new User(1, "Mart", new Account(1001)),
                new User(2, "Silva", new Account(1002)),
                new User(5, "Peter", new Account(1003)),
                new User(9, "Jame", new Account(1004)),
                new User(8, "Poppy", new Account(1005))
        );
        for (var u : users) {
            userIdMapAccount.put(u.id(), u.account());
        }
        System.out.println(userIdMapAccount);
    }
}
