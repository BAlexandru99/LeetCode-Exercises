package LeetCode.DesignPatterns.Builder2;

import LeetCode.DesignPatterns.Builder1.Pizza.Builder;

public class Computer {
    private int RAM;
    private String CPU;
    private String GPU;
    private String Motherboard;
    private int StorageGB;

    public static class ComputerBuilder {
        
        Computer computer = new Computer();

        public ComputerBuilder setRam (int RAM){
            computer.RAM = RAM;
            return this;
        }

        public ComputerBuilder setCpu(String CPU){
            computer.CPU = CPU;
            return this;
        }

        public ComputerBuilder setGpu(String GPU){
            computer.GPU = GPU;
            return this;
        }

        public ComputerBuilder setMotherboarder(String motherboard){
            computer.Motherboard = motherboard;
            return this;
        }

        public ComputerBuilder setStorage(int gb){
            computer.StorageGB = gb;
            return this;
        }

        public Computer build(){
            if (computer.CPU == null || computer.RAM <= 0) {
                throw new IllegalStateException("Computer must have a CPU and RAM.");
            }
            return computer;
        }
        
    }
}
