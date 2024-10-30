package LeetCode.DesignPatterns.Observer1;

public class Member1 implements Notification {

    @Override
    public void receivedNotification() {
       System.out.println("Notification received successfully!");
    }
    
}
