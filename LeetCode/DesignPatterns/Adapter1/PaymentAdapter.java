package LeetCode.DesignPatterns.Adapter1;

public class PaymentAdapter implements NewPaymentSystem {

    private OldPaymentSystem oldPaymentSystem;

    public PaymentAdapter(OldPaymentSystem oldPaymentSystem){
        this.oldPaymentSystem = oldPaymentSystem;
    }


    @Override
    public String makePayment(String customerName, double amount , String currency) {
        String oldMessage = oldPaymentSystem.makePayment(customerName, amount);
        return oldMessage + " currency: " + currency;
    }
    
}
