package LeetCode.DesignPatterns.Observer1;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Notification member1 = new Member1();
        shop.addMembers(member1);
        shop.sendNotification();
    }
}
