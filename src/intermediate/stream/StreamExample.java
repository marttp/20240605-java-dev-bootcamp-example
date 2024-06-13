package intermediate.stream;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        // Wrapper class of primitive type stream
        List<Integer> integerList = List.of(1, 4, 5, 7, 8, 9, 3, 2, 6, 0);
        Stream<Integer> integerStream = integerList.stream();
        var multiply2Stream = integerStream.map(n -> n * 2)
                .filter(n -> n % 10 == 0) // [10,0]
                .toList();
        System.out.println(multiply2Stream);

        // Alternative
        var intStream = IntStream.of(1, 4, 5, 7, 8, 9, 3, 2, 6, 0);
        var avg = intStream.average()
                .orElseThrow(() -> new RuntimeException("Error"));
        System.out.println(avg);

        var fruitStream = Stream.of(
                "apple",
                "banana",
                "melon",
                "apple",
                "banana",
                "apple"
        );
        var countFrequency = fruitStream.collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        );
        System.out.println(countFrequency);


        List<Student> students = List.of(
                new Student("Mart", 'D'),
                new Student("Peter", 'A'),
                new Student("Taylor", 'B'),
                new Student("Jose", 'C'),
                new Student("Brook", 'B'),
                new Student("Kathy", 'A')
        );

        // Filter only A - B => Show as HashMap
        var interestGrade = Set.of('A', 'B');
        var result = students.stream()
                .filter(s -> interestGrade.contains(s.grade))
                .collect(Collectors.groupingBy(s -> s.grade));
        System.out.println(result);
    }

    private record Student(String name, char grade) {

    }
}
