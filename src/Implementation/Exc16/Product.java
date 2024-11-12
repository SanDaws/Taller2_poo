package Implementation.Exc16;

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
