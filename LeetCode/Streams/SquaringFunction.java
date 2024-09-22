import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaringFunction {
    public static void main(String[] args) {
        List <Integer> lista = Arrays.asList(10 , 21 , 9 , 42 , 11 , 26 , 14);
        
        List<Integer> finalList = lista.stream()
                                        .map(x -> x * x)
                                        .collect(Collectors.toList());
        
        System.out.println(finalList);
    }
}
