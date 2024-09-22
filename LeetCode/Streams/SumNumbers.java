import java.util.Arrays;
import java.util.List;

public class SumNumbers{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-2 , 5 , 10 , -1 , 11 , -44 , 12);
        
        int sum = list.stream()
                .filter(x -> x > 0)
                .reduce(0 , (x , y) -> x + y);
        System.out.println(sum);
    }
}