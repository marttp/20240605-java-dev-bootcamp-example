package mostusedinterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListForInterview {

    public static void main(String[] args) {
        // Definition
        List<String> names = new ArrayList<>();
        List<Person> personList = new ArrayList<>();
        var mart = new Person("Mart");
        // Insertion - 1
        names.add("Mart");
        personList.add(mart);
        System.out.println(names);
        System.out.println(personList);

        System.out.println();

        List<String> newUsers = List.of(
                "Toby",
                "Poppy",
                "Elf"
        );
        // Insertion many (all)
        names.addAll(newUsers);
        // Insertion on the index
        names.add(3, "Amily");
        personList.add(new Person("Amily"));
        System.out.println(names);

        // Insertion .add() - TC: O(1)
        // Insertion many/index - TC: O(n)

        // Remove - TC: O(n)
        names.remove("Toby");
        System.out.println(names);
        personList.remove(mart);
        System.out.println(personList);
        // Remove multiple
        personList.removeAll(List.of(new Person("Amily")));
        // Clear
        personList.clear(); // TC: O(1)

        System.out.println();

        System.out.println(names);
        System.out.println(personList);

        var isPoppyInList = names.contains("Poppy");
        System.out.println(STR."isPoppyInList: \{isPoppyInList}");

        System.out.println();
        // Copy from immutable to mutable format
        var numberList = new ArrayList<>(List.of(84, 7, 5, 8, 867, 54, 68, 51, 54));
        // Sorting -> TC: O(n log n)
        numberList.sort((e1, e2) -> Integer.compare(e1, e2)); // ASC
        System.out.println(numberList);
        // What if DESC?
        // numberList.sort((e1, e2) -> Integer.compare(e2, e1));
        numberList.sort(Collections.reverseOrder());
        System.out.println(numberList);

        List<Stat> statList = new ArrayList<>(
                List.of(
                        new Stat(1, 8),
                        new Stat(2, 5),
                        new Stat(3, 10),
                        new Stat(4, 9)
                )
        );
        System.out.println(statList);
        System.out.println();
        statList.sort((e1, e2) -> Integer.compare(e2.overall, e1.overall));
        System.out.println(statList);

        // Stream API Example
        // Event time - Overall stat * 3
        // Expectation -> Hire only 2 with overall base stat over 5
        var result = statList.stream()
                .filter(s -> s.overall > 5)
                .map(s -> new Stat(s.playerId, s.overall * 3))
                // Hire only 2 -> Pick best 2
                .sorted((e1, e2) -> Integer.compare(e2.overall, e1.overall)) // DESC
                .limit(2)
                .toList();
        var iterator = result.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private record Person(String name) {

    }

    private record Stat(int playerId, int overall) {

    }
}
