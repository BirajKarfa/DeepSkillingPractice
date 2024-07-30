/*
Big O Notation:
    Big O notation is a mathematical representation used to describe the 
    efficiency of an algorithm in terms of time and space complexity. It provides
    an upper bound on the growth rate of an algorithm's running time or space 
    requirements as the input size increases.

    Best-case scenario: The minimum time an algorithm takes to complete.
    Average-case scenario: The expected time an algorithm takes to complete, averaged 
                           over all possible inputs.
    Worst-case scenario: The maximum time an algorithm takes to complete.
*/

//Implementation

class Product {
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
        return "Product(" + productId + ", " + productName + ", " + category + ")";
    }
}

public class Ecommerce {

    public static Product linearSearch(Product[] products, int targetId) {
        int index = 0; //For test
        for (Product product : products) {
            if (product.productId == targetId) {
                System.out.println("Found at "+index+"th index"); //For test
                return product;
            }
            index++; //For test
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == targetId) {
                System.out.println("Found at "+mid+"th index"); //For test
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Pen", "Stationary"),
            new Product(5, "Pant", "Clothing"),
            new Product(4, "Desktop", "Electronics"),
            new Product(3, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(6, "Book", "Stationary")
        };
        Product result = linearSearch(products, 2);
        System.out.println(result);
        java.util.Arrays.sort(products, (a, b)->Integer.compare(a.productId, b.productId));
        result = binarySearch(products, 2);
        System.out.println(result);
    }
}

/*
Time Complexity Analysis:
    Linear Search: 
        Best-case: O(1)
        Average-case: O(n)
        Worst-case: O(n)

    Binary Search: 
        Best-case: O(1)
        Average-case: O(log n)
        Worst-case: O(log n)

Suitability:
    For an e-commerce platform, binary search is more suitable due to its logarithmic time complexity
    but, it requires the data to be sorted. If the dataset is small or unsorted, linear search might 
    be simpler to implement.
*/
