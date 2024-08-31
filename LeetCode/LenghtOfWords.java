import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LenghtOfWords {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alex" , "mare" , "capsuni" , "corcoduse");
        List<Integer> result = list.stream()
                         .map(x -> x.length())
                         .toList();
        System.out.println(result);
    }
}
