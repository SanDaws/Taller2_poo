package Classes.Exc17;

import java.util.ArrayList;
import java.util.List;

// Class Product
class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        } else {
            System.out.println("Insufficient stock for " + name);
            return false;
        }
    }

    public void displayProductInfo() {
        System.out.println("Product: " + name + ", Price: $" + price + ", Stock: " + stock);
    }
}

// Class Customer
class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Class Order
class Order {
    private Customer customer;
    private List<Product> purchasedProducts;
    private double totalAmount;

    public Order(Customer customer) {
        this.customer = customer;
        this.purchasedProducts = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addProduct(Product product, int quantity) {
        if (product.reduceStock(quantity)) {
            for (int i = 0; i < quantity; i++) {
                purchasedProducts.add(product);
            }
            totalAmount += product.getPrice() * quantity;
            System.out.println("Added " + quantity + " of " + product.getName() + " to the order.");
        }
    }

    public void displayOrderDetails() {
        System.out.println("Order for " + customer.getName() + " (" + customer.getEmail() + ")");
        System.out.println("Purchased Products:");
        for (Product product : purchasedProducts) {
            product.displayProductInfo();
        }
        System.out.println("Total Amount: $" + totalAmount);
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

// Class ProductInventory
class ProductInventory {
    private List<Product> products;

    public ProductInventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        System.out.println("Product not found: " + name);
        return null;
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : products) {
            product.displayProductInfo();
        }
    }
}

// Main class to demonstrate the online store system
public class OnlineStoreSystem {
    public static void main(String[] args) {
        // Create product inventory
        ProductInventory inventory = new ProductInventory();

        // Add products to inventory
        inventory.addProduct(new Product("Laptop", 1200.0, 10));
        inventory.addProduct(new Product("Phone", 800.0, 15));
        inventory.addProduct(new Product("Headphones", 150.0, 30));

        // Display initial inventory
        inventory.displayInventory();

        // Create a customer
        Customer customer = new Customer("Alice Johnson", "alice@example.com");

        // Create an order for the customer
        Order order = new Order(customer);

        // Add products to the order
        order.addProduct(inventory.getProductByName("Laptop"), 2);
        order.addProduct(inventory.getProductByName("Phone"), 1);

        // Display order details
        order.displayOrderDetails();

        // Display updated inventory after the sale
        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();
    }
}
