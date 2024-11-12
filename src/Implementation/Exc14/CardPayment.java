package Implementation.Exc14;

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
