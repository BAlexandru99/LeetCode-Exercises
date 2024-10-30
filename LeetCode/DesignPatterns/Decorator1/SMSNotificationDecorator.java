package LeetCode.DesignPatterns.Decorator1;

public class SMSNotificationDecorator extends NotificationDecorator  {

    public SMSNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String send(){
        return super.send() + " SMS received";
    }
    
}
