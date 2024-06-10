package oop.record;

import java.math.BigDecimal;

// record - special class to storing data as immutable
// Backend Java (modern) - Use record to represent data communication schema
public record ProductRecord(
        String name,
        String type,
        BigDecimal prices,
        String brand
) {

    // Custom encapsulation behavior
    @Override
    public String name() {
        return STR."[TPC] \{name}";
    }

    public static String giveMeStoreName() {
        return "[TPC]";
    }
}
