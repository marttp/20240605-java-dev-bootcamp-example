package codingquestion.assignment.string;

public class HowManyDigit {

    public static void main(String[] args) {
        String paragraph = "zx6cvzx81c56as1 sdx8ssa"; // Expected: 7
        int count = 0;
        for (char c : paragraph.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        System.out.println(STR."Digit in paragraph: \{count}");
    }
}
