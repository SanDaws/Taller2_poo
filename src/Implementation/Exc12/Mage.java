package Implementation.Exc12;

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
