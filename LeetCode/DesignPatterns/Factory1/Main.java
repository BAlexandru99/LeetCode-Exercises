package LeetCode.DesignPatterns.Factory1;

public class Main {
    public static void main(String[] args) {
        
    
    Vehicle car = Vehicle.get(Vehicle.type.Car);
    Vehicle bike = Vehicle.get(Vehicle.type.Bike);
    Vehicle truck = Vehicle.get(Vehicle.type.Truck);
    
    System.out.println(car.wheels());
    System.out.println(bike.wheels());
    System.out.println(truck.wheels());

    }
}
