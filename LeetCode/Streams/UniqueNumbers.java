import java.util.*;

public class UniqueNumbers {
    public static void main(String[] args) {
        Integer[] numbers = {4 , 2 , 2 , 2 , 3 , 5 , 5 , 1 , 9 , 7 , 7 ,8};
        List<Integer> lista = Arrays.asList(numbers);
        
        lista.stream()
            .distinct()
            .sorted()
            .forEach(x -> System.out.println(x));
    }
}
