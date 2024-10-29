package LeetCode.DesignPatterns.Adapter1;

public class Main {
    public static void main(String[] args) {
        OldPaymentSystem oldPaymentSystem = new OldPaymentSystem();
        NewPaymentSystem paymentAdapter = new PaymentAdapter(oldPaymentSystem);

        String message = paymentAdapter.makePayment("Alex", 200, "RON");
        System.out.println(message);
    }
}
