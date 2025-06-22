package Deepskilling_SnowinCafasso.Week1.EcommerceSearch;

import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    // Linear Search
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search (Assumes array is sorted by productName)
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(targetName);

            if (compare == 0)
                return products[mid];
            else if (compare < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "T-shirt", "Apparel"),
            new Product(3, "Shoes", "Footwear"),
            new Product(4, "Headphones", "Electronics"),
            new Product(5, "Mobile", "Electronics")
        };

        System.out.println("=== Linear Search ===");
        Product result1 = linearSearch(products, "Shoes");
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\n=== Binary Search ===");
        // Sort by productName before binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        Product result2 = binarySearch(products, "Shoes");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
