import java.util.Arrays;
import java.util.Comparator;
public class EcommerceSearch {
    static class Product {
        int productId;
        String productName;
        String category;
        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }
        @Override
        public String toString() {
            return productId + " - " + productName + " (" + category + ")";
        }
    }
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Coffee Maker", "Home Appliances"),
            new Product(104, "Book", "Stationery"),
            new Product(105, "Headphones", "Electronics")
        };
        System.out.println("=== Linear Search ===");
        Product result1 = linearSearch(products, "Shirt");
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found");
        System.out.println("\n=== Binary Search ===");
        sortProductsByName(products); 
        Product result2 = binarySearch(products, "Book");
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found");
        Product result3 = binarySearch(products, "Smartphone");
        System.out.println(result3 != null ? "Found: " + result3 : "Product not found");
    }
}
