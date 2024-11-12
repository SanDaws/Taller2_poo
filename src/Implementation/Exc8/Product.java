package Implementation.Exc8;

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

