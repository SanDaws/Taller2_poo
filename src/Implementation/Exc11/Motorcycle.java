package Implementation.Exc11;

import Implementation.Exc3.Vehicle;

// Subclass Motorcycle, which extends Vehicle
class Motorcycle extends Vehicle {
    // Additional attribute
    private String helmetType;

    // Constructor
    public Motorcycle(String brand, String model, int maxSpeed, String helmetType) {
        super(brand, model, maxSpeed); // Call to the superclass constructor
        this.helmetType = helmetType;
    }

    // Method to describe motorcycle's specific features
    public void describe() {
        super.describe(); // Call to Vehicle's describe method
        System.out.println("Helmet Type: " + helmetType);
    }

    // Getters and Setters
    public String getHelmetType() {
        return helmetType;
    }

    public void setHelmetType(String helmetType) {
        this.helmetType = helmetType;
    }
}
