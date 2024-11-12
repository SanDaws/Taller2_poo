package Implementation.Exc13;

//Main class to demonstrate polymorphism
public class Zoo {
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = {new Dog(), new Cat(), new Bird()};

        // Use polymorphism to make each animal sound
        for (Animal animal : animals) {
            animal.displayType();
            animal.makeSound();
        }
    }
}
