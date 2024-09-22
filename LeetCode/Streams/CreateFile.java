import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CreateFile{
    public static void main(String[] args) {
        Path cale = Paths.get(".");

        try {
            Stream<Path> lista = Files.list(cale);
            lista.forEach(x -> System.out.println(x.getFileName()));
        } catch (IOException e) {
            }
    }
}