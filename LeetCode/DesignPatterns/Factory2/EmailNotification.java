package LeetCode.DesignPatterns.Factory2;

public class EmailNotification implements Notification {

    @Override
    public String sendNotification() {
        return "You got and email!";
    }
   
}
