package Classes.Exc8;

import java.util.ArrayList;
import java.util.List;

class Product {
    // Attributes
    private String name;
    private double price;
    private String category;

    // Constructor
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = Math.max(price, 0); // Ensure price is non-negative
        this.category = category;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // toString method for easy product information display
    @Override
    public String toString() {
        return "Product: " + name + ", Price: $" + price + ", Category: " + category;
    }
}

class Inventory {
    // List to hold products
    private List<Product> products;

    // Constructor
    public Inventory() {
        this.products = new ArrayList<>();
    }

    // Method to add a product to the inventory
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    // Method to search for products by category
    public List<Product> searchByCategory(String category) {
        List<Product> results = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                results.add(product);
            }
        }
        return results;
    }

    // Method to calculate the total inventory value
    public double calculateTotalInventoryValue() {
        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.getPrice();
        }
        return totalValue;
    }

    // Method to display all products in the inventory
    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("Products in Inventory:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}

