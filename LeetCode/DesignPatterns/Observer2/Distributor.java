package LeetCode.DesignPatterns.Observer2;

public class Distributor implements Notification {

    @Override
    public void sendNotification(String product) {
       System.out.println("The order for " + product + " was sent successfully!");;
    }
    
}
