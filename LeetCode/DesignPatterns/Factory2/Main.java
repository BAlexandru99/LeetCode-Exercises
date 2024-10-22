package LeetCode.DesignPatterns.Factory2;

import java.lang.ProcessBuilder.Redirect.Type;

public class Main {
    public static void main(String[] args) {
        Notification smsNotification = Notification.get(Notification.Type.SMSNotification);
        Notification pushNotification = Notification.get(Notification.Type.PushNotification);
        Notification emailNotification = Notification.get(Notification.Type.EmailNotification);

        System.out.println(smsNotification.sendNotification());
        System.out.println(pushNotification.sendNotification());
        System.out.println(emailNotification.sendNotification());
    }
}
