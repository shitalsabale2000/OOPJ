
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of " + (int)amount);
    }
}


class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment of " + (int)amount);
    }
}


public class PaymentGatewayDemoQ24 {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();

        creditCard.pay(2500);  
        paypal.pay(1500);      
    }
}
