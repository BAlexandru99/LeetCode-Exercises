package LeetCode.DesignPatterns.Builder2;

import LeetCode.DesignPatterns.Builder2.Computer.ComputerBuilder;

public class Main {
    public static void main(String[] args) {
        Computer WorkingComputer = new Computer.ComputerBuilder()
                           .setCpu("Intel I5")
                           .setMotherboarder("Intel")
                           .setRam(2)
                           .setStorage(500)
                           .build();

        Computer GamingComputer = new Computer.ComputerBuilder()
                            .setCpu("Intel I9")
                            .setMotherboarder("Palit")
                            .setRam(32)
                            .setStorage(1000)
                            .build();
    }
}
