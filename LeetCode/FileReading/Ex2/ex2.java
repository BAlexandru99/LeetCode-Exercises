package LeetCode.FileReading.Ex2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;

public class ex2 {
    public static void main(String[] args) {
        
    Path path = Paths.get("LeetCode\\\\FileReading\\\\Ex2\\\\ex2.txt");

    try(BufferedWriter writer = Files.newBufferedWriter(path)){
        writer.append("This is the first line");
        writer.newLine();
        writer.append("This is the second line");
    }catch(IOException e){
        System.out.println("Error occured!");
    }
  }
}
