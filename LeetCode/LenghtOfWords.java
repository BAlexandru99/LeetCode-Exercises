import java.util.Arrays;
import java.util.List;

public class LenghtOfWords {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alex" , "mare" , "capsuni" , "corcoduse");
        List<Integer> result = list.stream()
                         .map(x -> x.length())
                         .toList();
        System.out.println(result);
    }
}
