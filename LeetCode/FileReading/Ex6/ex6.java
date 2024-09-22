package LeetCode.FileReading.Ex6;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.nio.file.Files;

public class ex6 {
    public static void main(String[] args) {
        Path path = Paths.get("LeetCode\\\\FileReading\\\\Ex6\\\\ex6.txt");

        try(BufferedReader reader = Files.newBufferedReader(path)){
            String text;
            while((text = reader.readLine()) != null){
                System.out.println(text.replaceAll(" ", ""));
            }
        } catch (IOException e) {
            System.out.println("Error occured");
        }
    }
}
