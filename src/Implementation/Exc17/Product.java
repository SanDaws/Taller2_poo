package Implementation.Exc17;

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
