package Implementation.Exc15;

import java.util.ArrayList;
import java.util.List;

// Class Fleet
class Fleet {
    // List to store vehicles
    private List<Vehicle> vehicles;

    // Constructor
    public Fleet() {
        vehicles = new ArrayList<>();
    }

    // Method to add a vehicle to the fleet
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added to fleet: " + vehicle.getBrand() + " " + vehicle.getModel());
    }

    // Method to record maintenance for vehicles based on mileage threshold
    public void performMaintenance(int mileageThreshold, String maintenanceDescription) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMileage() >= mileageThreshold) {
                vehicle.registerMaintenance(maintenanceDescription);
            }
        }
    }

    // Method to display all vehicles and their maintenance histories
    public void displayFleetMaintenanceHistory() {
        for (Vehicle vehicle : vehicles) {
            vehicle.displayMaintenanceHistory();
            System.out.println();
        }
    }
}

// Main class to demonstrate the system
//public class FleetMaintenanceSystem {
//    public static void main(String[] args) {
//        // Create a fleet
//        Fleet fleet = new Fleet();
//
//        // Add vehicles to the fleet
//        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", 12000);
//        Vehicle vehicle2 = new Vehicle("Ford", "F-150", 25000);
//        Vehicle vehicle3 = new Vehicle("Honda", "Civic", 8000);
//
//        fleet.addVehicle(vehicle1);
//        fleet.addVehicle(vehicle2);
//        fleet.addVehicle(vehicle3);
//
//        // Register maintenance for vehicles with mileage >= 10000
//        fleet.performMaintenance(10000, "Oil change and inspection");
//
//        // Display maintenance history of all vehicles in the fleet
//        fleet.displayFleetMaintenanceHistory();
//    }
//}

