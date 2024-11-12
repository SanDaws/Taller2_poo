package Classes.Exc16;

import java.util.ArrayList;
import java.util.List;

// Class Product
class Product {
    // Attributes
    private String name;
    private String category;
    private double price;
    private int stock;

    // Constructor
    public Product(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // Method to update stock
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        } else {
            System.out.println("Insufficient stock for " + name);
            return false;
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Display product information
    public void displayProductInfo() {
        System.out.println("Product: " + name + ", Category: " + category + ", Price: $" + price + ", Stock: " + stock);
    }
}

// Class Inventory
class Inventory {
    private List<Product> products;

    // Constructor
    public Inventory() {
        products = new ArrayList<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added product: " + product.getName());
    }

    // Method to remove a product by name
    public boolean removeProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                products.remove(product);
                System.out.println("Removed product: " + name);
                return true;
            }
        }
        System.out.println("Product not found: " + name);
        return false;
    }

    // Method to search for products by name
    public Product searchByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.displayProductInfo();
                return product;
            }
        }
        System.out.println("Product not found: " + name);
        return null;
    }

    // Method to search for products by category
    public void searchByCategory(String category) {
        System.out.println("Products in category: " + category);
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                product.displayProductInfo();
            }
        }
    }

    // Method to update stock after a sale
    public void sellProduct(String name, int quantity) {
        Product product = searchByName(name);
        if (product != null) {
            if (product.reduceStock(quantity)) {
                System.out.println("Sold " + quantity + " of " + name);
            }
        }
    }
}

// Main class to demonstrate inventory management
public class StoreInventorySystem {
    public static void main(String[] args) {
        // Create inventory
        Inventory inventory = new Inventory();

        // Add products to inventory
        inventory.addProduct(new Product("Laptop", "Electronics", 1200.0, 10));
        inventory.addProduct(new Product("Phone", "Electronics", 800.0, 15));
        inventory.addProduct(new Product("T-Shirt", "Clothing", 20.0, 50));

        // Search products
        inventory.searchByName("Laptop");
        inventory.searchByCategory("Electronics");

        // Sell a product
        inventory.sellProduct("Laptop", 2);

        // Display updated stock after sale
        inventory.searchByName("Laptop");

        // Remove a product
        inventory.removeProduct("Phone");

        // Attempt to remove a non-existing product
        inventory.removeProduct("Tablet");
    }
}
