
package LeetCode.FileReading.Ex1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;


public class ex1 {
    public static void main(String[] args) {
        Path p = Paths.get("LeetCode\\FileReading\\Ex1\\ex1.txt");
        

        try{
            Files.lines(p)
                .forEach(line -> System.out.println(line));
        } catch (Exception e) {
            System.out.println("File could not be read.");
        }

        //-->Method II:

        // try (BufferedReader reader = Files.newBufferedReader(p) ){
        //     String line;
        //     while((line = reader.readLine()) != null){
        //         System.out.println(line);
        //     }
        // } catch (Exception e) {
        //      System.out.println("File could not be read.");
        // }
    }
}
