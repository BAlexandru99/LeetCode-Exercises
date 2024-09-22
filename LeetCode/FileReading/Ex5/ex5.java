package LeetCode.FileReading.Ex5;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.nio.file.Files;

public class ex5 {
    public static void main(String[] args) {
        Path path = Paths.get("LeetCode\\\\FileReading\\\\Ex5\\\\ex5.txt");

        // Method 1 :
        try{
            long lines = Files.lines(path)
                        .count();

            Files.lines(path)
                .forEach(x -> System.out.println(x));

            System.out.println("Number of lines: " + lines);
        } catch (Exception e) {
            System.out.println("Error occured");
        }

        // Method 2 :
        // try(BufferedReader reader = Files.newBufferedReader(path)){
        //     String lines;
        //     int count = 0;
        //     while((lines = reader.readLine()) != null){
        //         System.out.println(lines);
        //         count++;
        //     }
        //     System.out.println("Number of lines: " + count);

        // } catch (Exception e) {
        //     System.out.println("Error occured");
        // }
    }
}
