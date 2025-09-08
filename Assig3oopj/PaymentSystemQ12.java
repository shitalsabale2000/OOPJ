
abstract class Payment {
    public abstract void pay(); 
}


class CreditCardPayment extends Payment {
    private String cardNumber;
    private double amount;

    public CreditCardPayment(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " → Rs. " + (int)amount + " Paid");
    }
}

class UPIPayment extends Payment {
    private String upiId;
    private double amount;

    public UPIPayment(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Payment via UPI " + upiId + " → Rs. " + (int)amount + " Paid");
    }
}


public class PaymentSystemQ12 {
    public static void main(String[] args) {
        CreditCardPayment ccp = new CreditCardPayment("1234567890123456", 5000);
        UPIPayment upi = new UPIPayment("rahul@upi", 2000);

        ccp.pay();
        upi.pay();
    }
}
