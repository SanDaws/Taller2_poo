package Implementation.Exc4;

public class Person {
    // Attributes
    private String name;
    private int age;
    private char gender; // 'M' for male, 'F' for female, etc.

    // Constructor
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = Math.max(age, 0); // Ensure age is non-negative
        this.gender = gender;
    }

    // Method to compare age with another person
    public void compareAge(Person otherPerson) {
        if (otherPerson == null) {
            System.out.println("The other person is not specified.");
            return;
        }

        if (this.age > otherPerson.age) {
            System.out.println(this.name + " is older than " + otherPerson.name + ".");
        } else if (this.age < otherPerson.age) {
            System.out.println(this.name + " is younger than " + otherPerson.name + ".");
        } else {
            System.out.println(this.name + " and " + otherPerson.name + " are the same age.");
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

