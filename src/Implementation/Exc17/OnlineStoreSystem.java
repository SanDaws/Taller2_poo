package Implementation.Exc17;
import Class.Product;
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
