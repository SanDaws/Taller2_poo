package Classes.Exc11;

import Classes.Exc3.Vehicle;

// Subclass Car, which extends Vehicle
class Car extends Vehicle {
    // Additional attribute
    private int numDoors;

    // Constructor
    public Car(String brand, String model, int maxSpeed, int numDoors) {
        super(brand, model, maxSpeed); // Call to the superclass constructor
        this.numDoors = numDoors;
    }

    // Method to describe car's specific features
    public void describe() {
        super.describe(); // Call to Vehicle's describe method
        System.out.println("Number of Doors: " + numDoors);
    }

    // Getters and Setters
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}

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

