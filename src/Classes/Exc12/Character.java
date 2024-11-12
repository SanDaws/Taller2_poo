package Classes.Exc12;

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

// Subclass Warrior
class Warrior extends Character {
    // Additional attribute for Warrior
    private int strength;

    // Constructor
    public Warrior(String name, int level, int strength) {
        super(name, level);
        this.strength = strength;
    }

    // Implementing the attack method for Warrior
    @Override
    public void attack() {
        System.out.println(getName() + " performs a powerful sword strike with strength " + strength + "!");
    }

    // Getter and Setter for strength
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}

// Subclass Mage
class Mage extends Character {
    // Additional attribute for Mage
    private int mana;

    // Constructor
    public Mage(String name, int level, int mana) {
        super(name, level);
        this.mana = mana;
    }

    // Implementing the attack method for Mage
    @Override
    public void attack() {
        System.out.println(getName() + " casts a powerful fireball using " + mana + " mana!");
    }

    // Getter and Setter for mana
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
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

