package codingquestion.assignment.string;

public class ILoveVowel {

    public static void main(String[] args) {
        String paragraph = "Hello, you are so beautiful"; // Expected: 12
        int count = 0;
        char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        for (char c : paragraph.toCharArray()) {
            for (char v : vowels) {
                if (c == v) {
                    count++;
                }
            }
        }
        System.out.println(STR."Vowel in paragraph: \{count}");
    }
}
