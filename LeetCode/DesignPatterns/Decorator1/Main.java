package LeetCode.DesignPatterns.Decorator1;

public class Main {
    public static void main(String[] args) {
        Notification notification = new BasicNotification();
        Notification smsNotification = new SMSNotificationDecorator(notification);

        System.out.println(smsNotification.send());
    }
}
