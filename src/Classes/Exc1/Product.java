package Classes.Exc1;

public class Product {
    // Attributes
    private String name;
    private double price;
    private int stockQuantity;

    // Constructor
    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = Math.max(stockQuantity, 0); // Ensure it is not negative
    }

    // Methods to increase and decrease stock
    public void increaseStock(int quantity) {
        if (quantity > 0) {
            this.stockQuantity += quantity;
        } else {
            System.out.println("The quantity to increase must be positive.");
        }
    }

    public void decreaseStock(int quantity) {
        if (quantity > 0 && quantity <= this.stockQuantity) {
            this.stockQuantity -= quantity;
        } else {
            System.out.println("Invalid quantity. Stock cannot be reduced below 0.");
        }
    }

    public double calculateTotalStockValue() {
        return this.price * this.stockQuantity;
    }

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
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        } else {
            System.out.println("Stock quantity cannot be negative.");
        }
    }
}

