package LeetCode.FileReading.Ex8;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.lang.StringBuilder;
import java.util.*;
import java.util.stream.Collectors;


public class ex8 {
    public static void main(String[] args) {
        Path path = Paths.get("LeetCode\\\\FileReading\\\\Ex8\\\\ex8.txt");
        Path path2 = Paths.get("LeetCode\\\\FileReading\\\\Ex8\\\\ex8New.txt");
        try {
            List<String> reverselist =  Files.lines(path)
                                        .map(line -> new StringBuilder(line).reverse().toString())
                                        .collect(Collectors.toList());
            Files.write(path2, reverselist);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
