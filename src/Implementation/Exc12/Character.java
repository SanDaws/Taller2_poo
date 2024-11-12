package Implementation.Exc12;

// Base class Character
abstract class Character {
    // Attributes
    private String name;
    private int level;

    // Constructor
    public Character(String name, int level) {
        this.name = name;
        this.level = Math.max(level, 1); // Ensure level is at least 1
    }

    // Abstract method to attack (to be implemented in subclasses)
    public abstract void attack();

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level > 0) {
            this.level = level;
        } else {
            System.out.println("Level must be positive.");
        }
    }

    // Method to display character information
    public void displayInfo() {
        System.out.println("Character: " + name + ", Level: " + level);
    }
}

// Main class to demonstrate polymorphism
//public class Game {
//    public static void main(String[] args) {
//        // Creating a Warrior and a Mage
//        Character warrior = new Warrior("Thor", 10, 80);
//        Character mage = new Mage("Merlin", 12, 100);
//
//        // Display information and attacks
//        warrior.displayInfo();
//        warrior.attack();
//
//        mage.displayInfo();
//        mage.attack();
//    }
//}

