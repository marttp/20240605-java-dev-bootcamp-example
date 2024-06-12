package intermediate.collections.list;

import intermediate.collections.model.Product;
import util.TutorialUtil;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        var iPhone = new Product("iPhone", 35000.0, 20);
        var linuxLaptop = new Product("Laptop Linux", 13000.0, 35);
        var bookProduct = new Product("Book", 230.0, 10);

        List<Product> products = new ArrayList<>();
        products.add(iPhone);
        products.add(linuxLaptop);
        products.add(bookProduct);

        for (var p : products) {
            System.out.println(p);
        }

        TutorialUtil.line();

        // Example of add all
        List<Product> newListOfProducts = new ArrayList<>();
        var microphone = new Product("Microphone", 2500.0, 16);
        newListOfProducts.add(microphone);
        newListOfProducts.addAll(products);
        for (var p : newListOfProducts) {
            System.out.println(p);
        }

        TutorialUtil.line();

        // Get first
        System.out.println(newListOfProducts.getFirst());
        // Get last
        System.out.println(newListOfProducts.getLast());
        // Access element by index
        System.out.println(newListOfProducts.get(2));

        var searchCriteria = new Product("Laptop Linux", 13000.0, 35);
        if (newListOfProducts.contains(searchCriteria)) {
            System.out.println("Contain Linux Laptop with prices 13000.0 amount 35");
        }

        TutorialUtil.line();

        // Modify data within array list - Normal class, cannot use record
        // Replace data on the index
        var index2 = newListOfProducts.get(2);
        System.out.println(index2);
        var doll = new Product("Doll", 150.0, 5);
        newListOfProducts.set(2, doll);
        System.out.println(newListOfProducts.get(2));
    }
}
