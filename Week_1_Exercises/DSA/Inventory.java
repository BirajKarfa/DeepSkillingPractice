/*
Importance of Data Structures and Algorithms in Inventory Management:
    a. Efficient data storage and retrieval are essential for managing inventories effectively.
    b. Properly chosen data structures ensure scalability as the inventory grows.
    c. Efficient algorithms help minimize resource usage while performing inventory-related tasks.

Suitable Data Structures for Inventory Management:
    Arrays/Lists: Useful for simple implementations but their fixed size and linear search times limit their efficiency.
    Linked Lists: Dynamic and allow efficient insertions/deletions but searching requires traversing the list.
    Hash Tables (HashMaps): Excellent for fast lookups.
*/

// Implementation

import java.util.HashMap;
import java.util.Map;

class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;

    public Product(int productId, String productName, int productQuantity, double productPrice) {
        this.id=productId;
        this.name=productName;
        this.quantity=productQuantity;
        this.price=productPrice;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String productName){
        this.name=productName;
    }

    public void setQuantity(int productQuantity){
        this.quantity=productQuantity;
    }

    public void setPrice(int productPrice){
        this.price=productPrice;
    }
}

public class Inventory {
    private Map<Integer, Product> productMap = new HashMap<>();

    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public void updateProduct(int productId, Product updatedProduct) {
        if (productMap.containsKey(productId)) {
            productMap.put(productId, updatedProduct);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int productId) {
        productMap.remove(productId);
    }
    
    /*
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product p1 = new Product(101, "Marie", 50, 19.99);
        Product p2 = new Product(102, "Chocolate", 30, 29.99);
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        p1.setQuantity(40);
        inventory.updateProduct(p1.getId(), p1);
        inventory.deleteProduct(p2.getId());
    }
    */
}

/*
Time complexity: O(1) for Insertion/Deletion & Updation
*/
