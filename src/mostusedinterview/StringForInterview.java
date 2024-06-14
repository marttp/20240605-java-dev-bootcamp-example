package mostusedinterview;

import java.util.Arrays;

public class StringForInterview {

    public static void main(String[] args) {
        // Definition
        String bookName = "Platform Engineering on Kubernetes with Java";
        // String.valueOf -> Primitive to String
        String alternativeBookName1 = new String(String.valueOf(5));
        String alternativeBookName2 = String.valueOf(5);

        // How long of the text?
        int sizeOfMessage = bookName.length(); // TC: O(1)
        System.out.println(sizeOfMessage);

        // Convert to char array
        char[] bookNameChars = bookName.toCharArray(); // TC: O(n)
        System.out.println(bookNameChars);

        // Lowercase, Uppercase
        String uppercaseName = bookName.toUpperCase(); // TC: O(n)
        String lowercaseName = bookName.toLowerCase(); // TC: O(n)
        System.out.println(uppercaseName);
        System.out.println(lowercaseName);

        // Access on specific index
        // If you give index to large -> it can throw IndexOutOfBoundException
        char selectedChar = bookName.charAt(4); // TC: O(1)
        System.out.println(selectedChar);

        // Substring
        System.out.println(bookName.substring(15));  // TC: O(n)
        System.out.println(bookName.substring(15, 18)); // TC: O(n)

        // Replace
        String newTitle = bookName.replace("Java", "Rust");
        System.out.println(newTitle);

        String exampleData = "YWFz4ZG15FzZG565FzZGF4zZ4G5FkYX3NkCg==";
        for (var c : exampleData.toCharArray()) {
            System.out.println();
            System.out.println(c);
            System.out.println(Character.isLetter(c));
            System.out.println(Character.isUpperCase(c));
            System.out.println(Character.isDigit(c));
            System.out.println(Character.isLetterOrDigit(c));
        }

        String exampleMessage = "asjkdfhjkashdjkladf";
        int[] counter = new int[26];
        // Play with character index
        // 'a' = 0
        // 'a' - 'a' = 0
        // 'c' - 'a' = 2
        for (char c : exampleMessage.toCharArray()) {
            int distant = c - 'a';
            counter[distant]++;
        }
        System.out.println(Arrays.toString(counter));
        // Convert index back to character
        for (int i = 0; i < counter.length; i++) {
            char c = (char) ('a' + i);
            System.out.println(c + ":" + counter[i]);
        }

        // String - Immutable
        // If you want to make it mutable, Organize with StringBuilder
        // and then create String
        String firstName = "Thanaphoom";
        String lastName = "Babparn";
        String fullNameWithPlusConcat = firstName + " " + lastName; // Concatenation -> O(n)

        StringBuilder sb = new StringBuilder();
        sb.append(firstName); // O(1)
        sb.append(" ");
        sb.append(lastName);
        String fullNameWithStringBuilder = sb.toString();

        // Preview -> JDK 21
        System.out.println(STR."\{firstName} \{lastName}");
    }
}
