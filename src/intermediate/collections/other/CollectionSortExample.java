package intermediate.collections.other;

import intermediate.collections.model.Product;

import java.util.*;

public class CollectionSortExample {

    public static void main(String[] args) {

        var iPhone = new Product("iPhone", 35000.0, 20);
        var linuxLaptop = new Product("Laptop Linux", 13000.0, 35);
        var bookProduct = new Product("Book", 230.0, 10);
        var androidPhone = new Product("Android", 30000.0, 38);

        List<Product> products = new ArrayList<>();
        products.add(iPhone);
        products.add(linuxLaptop);
        products.add(bookProduct);
        products.add(androidPhone);

        // Sort by prices - ASC
        // products.sort(Comparator.comparingDouble(Product::prices));
         products.sort((e1, e2) -> Double.compare(e1.prices(), e2.prices()));
        // Collections.sort(products, Comparator.comparingDouble(Product::prices));
        System.out.println(products);

        // Sort by prices - DESC
        products.sort((e1, e2) -> Double.compare(e2.prices(), e1.prices()));
        System.out.println(products);
    }
}
