package fundamentals;

import java.util.Arrays;

public class StringExample {

    // String - data type for text on Java (almost every programming languages)
    // String - immutable, reference type -> Store on heap
    // String variableName = "ตัวอย่างข้อมูล";
    void main() {
        stringExample();
        System.out.println("======");
        stringBuilderExample();
        System.out.println("======");
        // "name:exp:nationality"
        String name = "Mart";
        int exp = 5;
        String nationality = "Thai";
        // New Java
        String introduction = STR."\{name}:\{exp}:\{nationality}"; // Know exactly pattern
        System.out.println(introduction);
        String multilineString = """
                Hello, everyone.
                I'm Thanaphoom Babparn. TP Coder, YT + FB
                """;
        System.out.println(multilineString);
        // Other utilities
        String[] strArray = {name, String.valueOf(exp), nationality};
        String joinWithCustomDelimeter = String.join("-", strArray); // Unknown how long of incoming data
        System.out.println(joinWithCustomDelimeter);
    }

    private static void stringExample() {
        String name = "TP Coder";
        // name = "TP Coder, exp 5 years"; // Reassign
        // name = name + ", exp 5 years"; // Concat 1
        name = name.concat(", exp 5 years"); // Concat 2
        System.out.println(name);
        // String - array of character
        char[] nameCharArray = name.toCharArray();
        System.out.println(nameCharArray);
        System.out.println(Arrays.toString(nameCharArray));
        // String - has many utility methods
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        // Compare string - use equals
        var ex1 = "TP";
        var ex2 = "tp";
        System.out.println(ex1.equals(ex2)); // false
        System.out.println(ex1.equalsIgnoreCase(ex2)); // true
    }

    private static void stringBuilderExample() {
        // "name:exp:nationality"
        String name = "Mart";
        int exp = 5;
        String nationality = "Thai";

        // String key = name + exp + nationality; // Concat 2 times, generate in background 2 times
        String key = name + ":" + exp + ":" + nationality; // Concat 4 times

        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(":");
        sb.append(exp);
        sb.append(":");
        sb.append(nationality);
        String keyBySb = sb.toString(); // Generate 1 time

        System.out.println(key);
        System.out.println(keyBySb);
    }
}
