package LeetCode.DesignPatterns.Factory2;

public interface Notification {
    String sendNotification(); 

    static Notification get(Type type){
        return switch(type){
            case SMSNotification -> new SMSNotification();
            case PushNotification -> new PushNotification();
            case EmailNotification -> new EmailNotification();
        };
    } 

    enum Type{
        SMSNotification , PushNotification , EmailNotification
    }
}