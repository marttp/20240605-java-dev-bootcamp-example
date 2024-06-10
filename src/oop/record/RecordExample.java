package oop.record;

import java.math.BigDecimal;

public class RecordExample {

    public static void main(String[] args) {
        // Old
        Product p1 = new Product("macbook", "electronic", new BigDecimal("1000.00"), "a");
        // record
        ProductRecord productRecord = new ProductRecord("laptop", "electronic", new BigDecimal("100.00"), "l");
        System.out.println(productRecord); // Implemented toString already
        System.out.println(productRecord.type()); // Access state/field/property
        System.out.println(productRecord.name()); // name() customized
        System.out.println(ProductRecord.giveMeStoreName()); // Use static on record class
    }
}
