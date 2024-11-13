package Class;


public class Product {
    // Attributes
    private String name;
    private double price;
    private String category;
    private int stock;

    // Constructor
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = Math.max(price, 0); // Ensure price is non-negative
        this.category = category;
    }

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stock = Math.max(stockQuantity, 0); // Ensure it is not negative
    }
    public Product(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // accessor and mutator
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock quantity cannot be negative.");
        }
    }

    //methods
    public double calculateTotalStockValue() {
        return this.price * this.stock;
    }

    public void increaseStock(int quantity) {
        if (quantity > 0) {
            this.stock += quantity;
        } else {
            System.out.println("The quantity to increase must be positive.");
        }
    }

    public void decreaseStock(int quantity) {
        if (quantity > 0 && quantity <= this.stock) {
            this.stock -= quantity;
        } else {
            System.out.println("Invalid quantity. Stock cannot be reduced below 0.");
        }
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


    // toString method for easy product information display
    @Override
    public String toString() {
        return "Product: " + name + ", Price: $" + price + ", Category: " + category;
    }

    public void displayProductInfo() {
        System.out.println("Product: " + name + ", Category: " + category + ", Price: $" + price + ", Stock: " + stock);
    }
}

