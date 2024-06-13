package intermediate.generic.basic;

import intermediate.generic.basic.generic.PrintWriter;

public class GenericExample {
    /*
    * Generics allows us to create
    * a single class, interface, and method
    * that can be used with different types of data (objects)
    * Note: Generics does not work with primitive types -> Work with reference type
    *
    * == Pros ==
    * 1. Code Reusability
    * 2. Compile-time Type Checking
    * 3. Used with Collections (I already shared you on collections package)
    *
    * Approach
    * - Generic Class (Bounded Types optional)
    * - Generic Method
    * */
    public static void main(String[] args) {
        // Declare example - Generic class
        PrintWriter<Integer> intPrintWriter = new PrintWriter<>();
        intPrintWriter.print(9);

        var doublePrintWriter = new PrintWriter<Double>();
        doublePrintWriter.print(10.0);

        PrintWriter<Product> productPrintWriter = new PrintWriter<>();
        var iPhone = new Product("iPhone", 35000.0);
        productPrintWriter.print(iPhone);

        genericMethod(9);
        genericMethod(10.0);
        genericMethod(iPhone);
    }

    private static <T> void genericMethod(T data) {
        System.out.println("Generic method");
        System.out.println(data);
    }
}
