package fundamentals;

public class MathExample {

    public static void main(String[] args) {
        // ⭐️ Absolute - different from 0
        System.out.println(Math.abs(-5));

        // Trigonometric - sin,cos,tan,cosec,sec,cot
        System.out.println(Math.sin(Math.toRadians(45)));

        // ⭐️ Power
        System.out.println(Math.pow(2.0, 10.0));
        // Square root
        System.out.println(Math.sqrt(25));

        // ⭐️ Compare
        var min = Math.min(5,9);
        System.out.println(min);
        var max = Math.max(5,9);
        System.out.println(max);
        // Integer.min(), Integer.max(), Double.min() and so on

        // ⭐️ round, floor, ceil
        System.out.println(Math.round(2.4)); // 2
        System.out.println(Math.round(2.5)); // 3
        System.out.println(Math.floor(2.4)); // 2
        System.out.println(Math.floor(2.5)); // 2
        System.out.println(Math.ceil(2.4)); // 3
        System.out.println(Math.ceil(2.5)); // 3

        // PI, E, TAU constant
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.TAU);
    }
}
