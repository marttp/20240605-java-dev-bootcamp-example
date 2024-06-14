package mostusedinterview;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class MapForInterview {

    // HashTable -> Key, Value mapping
    // Purpose: Fast retrieve data
    // Technique: In-Memory database for your question

    public static void main(String[] args) {
        // Student Table
        // Id -> Student
        Map<Integer, Student> studentTable = new HashMap<>();
        var mart = new Student(1, "Mart");
        studentTable.put(mart.id, mart);
        System.out.println(studentTable.get(1)); // TC: O(1)
        // Check if key exists then access
        if (studentTable.containsKey(4)) {
            System.out.println(studentTable.get(4));
        }

        // PriorityQueue + HashMap -> Character Frequency
        // Find the most frequency of character on message
        String message = "A&^C9AD9y(*^&(*$@&*()@uU8uAU09ud09asudl";
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : message.toCharArray()) {
//            if (!freqMap.containsKey(c)) {
//                // If not exists default
//                freqMap.put(c, 0);
//            }
            freqMap.putIfAbsent(c, 0);
            freqMap.put(c, freqMap.get(c) + 1);
        }
        Set<Map.Entry<Character, Integer>> entrySet = freqMap.entrySet();
        // Max Heap
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (e1, e2) -> Integer.compare(e2.getValue(), e1.getValue())
        );
        pq.addAll(entrySet);

        while (!pq.isEmpty()) {
            var entry = pq.poll();
            System.out.println(STR."\{entry.getKey()} -> \{entry.getValue()}");
        }
    }

    private record Student(int id, String name) {

    }
}
