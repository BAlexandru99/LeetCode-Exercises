package LeetCode.DesignPatterns.Observer2;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop(2, 2);
        Notification distributor = new Distributor();
        
        shop.addDistributor(distributor);
        shop.buyBread(2);
        shop.buyKiwi(2);
    }
}
