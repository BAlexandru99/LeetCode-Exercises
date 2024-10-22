package LeetCode.DesignPatterns.Factory1;

public interface Vehicle {
    int wheels();

    // factory method
    static Vehicle get (type type){
        return switch (type) {
            case Bike -> new Bike();
            case Car  -> new Car();
            case Truck -> new Truck();
        };
    }

    enum type{
        Bike , Car , Truck;
    }
}