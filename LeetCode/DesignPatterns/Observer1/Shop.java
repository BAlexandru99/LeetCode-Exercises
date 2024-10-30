package LeetCode.DesignPatterns.Observer1;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    
    private List<Notification> list = new ArrayList<>();

    public void sendNotification(){
        System.out.println("Kiwi is now -15% OFF");
        informMembers();
    }

    public void addMembers(Notification notification){
        list.add(notification);
    }

    public void informMembers(){
        list.forEach(
            Notification -> Notification.receivedNotification()
        );
    }
}
