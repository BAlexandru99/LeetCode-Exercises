import java.util.*;
import java.util.stream.Collectors;

public class FilteringEvenNumbers {
    public static void main(String[] args) {

        List <Integer> lista = Arrays.asList(1 , 4 , 2 , 22 , 5 , 8 , 10 , 9);
        
        List <Integer> finalist = lista.stream()
            .filter(x -> x % 2 == 0)
            //.forEach( x -> System.out.println(x));
            .collect(Collectors.toList());

        System.out.println(finalist);
    
    }
}
