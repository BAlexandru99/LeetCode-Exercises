package LeetCode.DesignPatterns.Decorator1;

public class BasicNotification implements Notification{
    
    public String send(){
        return "New Notification!";
    }
}
