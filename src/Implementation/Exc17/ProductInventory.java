package Implementation.Exc17;

import java.util.ArrayList;
import java.util.List;
import  Class.Product;

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
