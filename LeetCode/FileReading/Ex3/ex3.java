package LeetCode.FileReading.Ex3;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.BufferedWriter;
import java.nio.file.Files;

public class ex3 {
    public static void main(String[] args) {
        Path path = Paths.get("LeetCode\\\\FileReading\\\\Ex3\\\\ex3.bin");

        try (InputStream reader = Files.newInputStream(path)){
            byte[] output = new byte[3];
            reader.read(output , 0 , 3);
            for(int i : output){
                System.out.println(i);
            }
        } catch (IOException e) {
            System.out.println("Error occured");
        }
    }
}
