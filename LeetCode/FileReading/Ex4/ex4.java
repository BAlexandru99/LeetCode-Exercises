package LeetCode.FileReading.Ex4;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.BufferedWriter;
import java.nio.file.Files;

public class ex4 {
    public static void main(String[] args) {
        Path path = Paths.get("LeetCode\\\\FileReading\\\\Ex4\\\\ex4.bin");

        try(OutputStream writer = Files.newOutputStream(path)) {
            byte [] output = {1 , 2 , 3 , 4 , 5};
            writer.write(output);
        } catch (IOException e) {
            System.out.println("Error occured");
        }
    }
}
