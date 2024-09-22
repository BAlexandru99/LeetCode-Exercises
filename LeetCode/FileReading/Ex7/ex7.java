package LeetCode.FileReading.Ex7;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.nio.file.Files;

public class ex7 {
    public static void main(String[] args) {
        Path path = Paths.get("LeetCode\\\\FileReading\\\\Ex7\\\\ex7.txt");
        String text = "Kiwi is brown.";
        try (BufferedWriter writer = Files.newBufferedWriter(path , StandardOpenOption.APPEND)){
            writer.newLine();
            writer.write(text);
        } catch (IOException e) {
            System.out.println("Error occured");
        }
    }
}
