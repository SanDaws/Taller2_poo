package Implementation.Exc15;

import java.util.ArrayList;
import java.util.List;

// Class Vehicle
class Vehicle {
    // Attributes
    private String brand;
    private String model;
    private int mileage;
    private List<String> maintenanceLog;

    // Constructor
    public Vehicle(String brand, String model, int mileage) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.maintenanceLog = new ArrayList<>();
    }

    // Method to register maintenance
    public void registerMaintenance(String maintenanceDescription) {
        maintenanceLog.add("Mileage: " + mileage + " - " + maintenanceDescription);
        System.out.println("Maintenance registered for " + brand + " " + model + ": " + maintenanceDescription);
    }

    // Method to display maintenance history
    public void displayMaintenanceHistory() {
        System.out.println("Maintenance History for " + brand + " " + model + ":");
        for (String record : maintenanceLog) {
            System.out.println(record);
        }
    }

    // Getters and Setters
    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
