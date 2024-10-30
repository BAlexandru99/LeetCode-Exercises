package LeetCode.DesignPatterns.Observer2;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private int kiwi;
    private int bread;
    private List<Notification>distributor = new ArrayList<>();

    public Shop (int kiwi , int bread){
        this.kiwi = kiwi;
        this.bread = bread;
    }
    
    public int buyKiwi(int quantity){
        int result = this.kiwi - quantity;
        if(result == 0){
            informDistributor("Kiwi");
        }
        return result;
    }

    public int buyBread(int quantity){
        int result = this.bread - quantity;
        if(result == 0){
            informDistributor("Bread");
        }
        return result;
    }

    public void addDistributor(Notification notification){
        distributor.add(notification);
    }
    
    public void informDistributor(String product){
        distributor.forEach(
            Notification -> Notification.sendNotification(product)
        );
    }

}
