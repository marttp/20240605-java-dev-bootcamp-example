package oop.record;

import java.math.BigDecimal;
import java.util.Objects;

// POJO - Plain Old Java Object
public class Product {
    private String name;
    private String type;
    private BigDecimal prices;
    private String brand;

    public Product(String name, String type, BigDecimal prices, String brand) {
        this.name = name;
        this.type = type;
        this.prices = prices;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrices() {
        return prices;
    }

    public void setPrices(BigDecimal prices) {
        this.prices = prices;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(type, product.type) && Objects.equals(prices, product.prices) && Objects.equals(brand, product.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, prices, brand);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", prices=" + prices +
                ", brand='" + brand + '\'' +
                '}';
    }
}
