package intermediate.collections.map;

import intermediate.collections.model.Account;
import intermediate.collections.model.User;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        // Key will maintain order based on add event
        Map<Long, Account> userIdMapAccount = new LinkedHashMap<>();
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
