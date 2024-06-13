package intermediate.lambdaexpr;

public class SpeakApp {

    public static void main(String[] args) {
        var mart = new Person("Mart");
//        shout(mart, (person) -> {
//            System.out.println(STR."Hello! My name is \{person.name()}");
//        });
        Speakable methodBody = (person) -> {
            System.out.println(STR."Hello! My name is \{person.name()}");
        };
        shout(mart, methodBody);
    }

    private static void shout(Person person, Speakable speakable) {
        speakable.speak(person);
    }

    private record Person(String name) {
    }

    @FunctionalInterface
    private interface Speakable {
        void speak(Person person);
    }
}
