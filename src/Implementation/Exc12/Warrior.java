package Implementation.Exc12;

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
