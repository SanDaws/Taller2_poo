package Classes.Exc14;

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

// Subclass CardPayment
class CardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;

    // Constructor
    public CardPayment(double amount, String cardNumber, String cardHolderName) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    // Overriding processPayment for card payment
    @Override
    public void processPayment() {
        System.out.println("Processing card payment of $" + amount);
        System.out.println("Cardholder: " + cardHolderName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Payment processed successfully via card.");
    }
}

// Subclass CashPayment
class CashPayment extends Payment {

    // Constructor
    public CashPayment(double amount) {
        super(amount);
    }

    // Overriding processPayment for cash payment
    @Override
    public void processPayment() {
        System.out.println("Processing cash payment of $" + amount);
        System.out.println("Please collect the cash. Payment completed successfully.");
    }
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

