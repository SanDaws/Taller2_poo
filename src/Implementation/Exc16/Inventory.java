package Implementation.Exc16;

import java.util.ArrayList;
import java.util.List;
import Class.Product;

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
