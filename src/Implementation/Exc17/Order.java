package Implementation.Exc17;

import java.util.ArrayList;
import java.util.List;
import Class.Product;

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
