package Implementation.Exc16;

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
