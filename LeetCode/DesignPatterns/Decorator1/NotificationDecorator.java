package LeetCode.DesignPatterns.Decorator1;

public class NotificationDecorator implements Notification {
    private Notification notification;

    public NotificationDecorator(Notification notification){
        this.notification = notification;
    }

    @Override
    public String send() {
        return notification.send();
    }
}
