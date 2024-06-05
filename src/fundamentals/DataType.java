package fundamentals;

public class DataType {

    /*
        Numeric Types - จำนวนเต็ม
            byte (8-bit signed integer)
            short (16-bit signed integer)
            int (32-bit signed integer, most commonly used)
            long (64-bit signed integer)

         Numeric Types Floating-Point (เลขทศนิยม)
            float (32-bit single-precision floating-point number)
            double (64-bit double-precision floating-point number, more commonly used)

         Character Type:
            char (16-bit Unicode character)

         Boolean Type:
            boolean (represents true or false)
    * */
    public static void main(String[] args) {
        // variables use camelCase
        byte exampleOfByte = 127;
        short exampleOfShort = 100;
        int exampleOfInteger = 100;
        long exampleOfLong = 100L;

        double exampleOfDouble = 25.00;
        float exampleOfFloat = 25.00f;

        char grade = 'D';
        boolean isEnabled = true; // disable mean isEnabled = false

        System.out.println(STR."exampleOfByte: \{exampleOfByte}");
        System.out.println(STR."exampleOfShort: \{exampleOfShort}");
        System.out.println(STR."exampleOfInteger: \{exampleOfInteger}");
        System.out.println(STR."exampleOfLong: \{exampleOfLong}");
        System.out.println(STR."exampleOfDouble: \{exampleOfDouble}");
        System.out.println(STR."exampleOfFloat: \{exampleOfFloat}");
        System.out.println(STR."grade: \{grade}");
        System.out.println(STR."isEnabled: \{isEnabled}");
    }
}
