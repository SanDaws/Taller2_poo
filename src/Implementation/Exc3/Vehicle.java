package Implementation.Exc3;

public class Vehicle {
    // Attributes
    private String brand;
    private String model;
    private int maxSpeed;
    private int currentSpeed;

    // Constructor
    public Vehicle(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = Math.max(maxSpeed, 0); // Ensure maxSpeed is not negative
        this.currentSpeed = 0; // Start with a speed of 0
    }

    // Method to accelerate the vehicle
    public void accelerate(int increment) {
        if (increment > 0) {
            currentSpeed = Math.min(currentSpeed + increment, maxSpeed); // Limit to maxSpeed
            System.out.println("Accelerated to " + currentSpeed + " km/h.");
        } else {
            System.out.println("Increment must be positive.");
        }
    }

    // Method to brake the vehicle
    public void brake(int decrement) {
        if (decrement > 0) {
            currentSpeed = Math.max(currentSpeed - decrement, 0); // Limit to minimum of 0
            System.out.println("Slowed down to " + currentSpeed + " km/h.");
        } else {
            System.out.println("Decrement must be positive.");
        }
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("Max speed cannot be negative.");
        }
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
