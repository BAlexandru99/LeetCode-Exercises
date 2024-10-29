package LeetCode.DesignPatterns.Adapter1;

public class OldPaymentSystem {

     String makePayment(String customerName , double amount){
        return customerName + ": " + amount;
    }
}
