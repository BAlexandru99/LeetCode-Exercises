 package LeetCode.DesignPatterns.Factory2;

public class SMSNotification implements Notification {

    @Override
    public String sendNotification() {
        return "You got a message";
    }
    
}