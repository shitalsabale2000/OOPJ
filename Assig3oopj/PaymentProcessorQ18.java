
abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void pay();
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(String cardNumber, double amount) {
        this.number = number;
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " → Rs. " + (int)amount + " Paid");
    }
}

class UPIPayment extends Payment {
    String upiId;

    UPIPayment(String upiId, double amount) {
        this.amount = amount;
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Payment via UPI " + upiId + " → Rs. " + (int)amount + " Paid");
    }
}


public class PaymentProcessorQ18 {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment("1234567890123456", 5000);
        p.pay();  // Output: Payment via Credit Card 1234567890123456 → Rs. 5000 Paid

        p = new UPIPayment("rahul@upi", 2000);
        p.pay();  // Output: Payment via UPI rahul@upi → Rs. 2000 Paid
    }
}
