package codingquestion.assignment.string;

public class ILoveEveryone {

    public static void main(String[] args) {
        String example = "aeioutestz";
        int[] amounts = new int[26];
        for (char c : example.toCharArray()) {
            amounts[c - 'a']++;
        }
        for (int i = 0; i < amounts.length; i++) {
            char c = (char) ('a' + i);
            System.out.println(STR."\{c}: \{amounts[i]}");
        }
    }
}
