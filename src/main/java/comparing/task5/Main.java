package comparing.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 3000.00, 5);
        Product p2 = new Product("Keyboard", 99.00, 4);
        Product p3 = new Product("Headphones", 99.00, 2);
        Product p4 = new Product("Charger", 99.00, 3);

        List<Product> products = List.of(p1, p2, p3, p4);

        List<Product> sortedProducts = new ArrayList<>(products);

        sortedProducts.sort(Comparator.comparing(Product::getPrice)
                .thenComparing(Comparator.comparing(Product::getRating).reversed())
        );

        // Should be sorted in order: Keyboard, Charger, Headphones, Laptop
        for (Product sortedProduct : sortedProducts) {
            System.out.println(sortedProduct);
        }
    }
}
