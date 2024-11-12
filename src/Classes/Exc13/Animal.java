package Classes.Exc13;

// Base class Animal
abstract class Animal {
    // Abstract method to make a sound
    public abstract void makeSound();

    // Method to display the animal's type (just for information)
    public void displayType() {
        System.out.println("I am an animal.");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

// Subclass Bird
class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Tweet! Tweet!");
    }
}

// Main class to demonstrate polymorphism
//public class Zoo {
//    public static void main(String[] args) {
//        // Create an array of Animal objects
//        Animal[] animals = {new Dog(), new Cat(), new Bird()};
//
//        // Use polymorphism to make each animal sound
//        for (Animal animal : animals) {
//            animal.displayType();
//            animal.makeSound();
//        }
//    }
//}

