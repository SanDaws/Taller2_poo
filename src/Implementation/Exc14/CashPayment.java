package Implementation.Exc14;

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
