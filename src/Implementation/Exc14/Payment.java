package Implementation.Exc14;

// Base class Payment
abstract class Payment {
    protected double amount;

    // Constructor
    public Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method to process the payment
    public abstract void processPayment();
}

// Main class to demonstrate polymorphism
//public class PaymentSystem {
//    public static void main(String[] args) {
//        // Create instances of different payment types
//        Payment cardPayment = new CardPayment(150.0, "1234-5678-9876-5432", "John Doe");
//        Payment cashPayment = new CashPayment(75.0);
//
//        // Process each payment using polymorphism
//        cardPayment.processPayment();
//        System.out.println(); // For readability
//        cashPayment.processPayment();
//    }
//}

