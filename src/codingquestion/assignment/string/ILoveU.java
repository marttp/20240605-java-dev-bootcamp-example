package codingquestion.assignment.string;

public class ILoveU {

    public static void main(String[] args) {
        String paragraph = "Hello, you are so beautiful"; // Expected: 3
        int count = 0;
        for (char c : paragraph.toCharArray()) {
            if (c == 'u' || c == 'U') {
                count++;
            }
        }
        System.out.println(STR."u/U in paragraph: \{count}");
    }
}
