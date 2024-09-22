import java.util.Arrays;
import java.util.List;

public class MultiplyAllNumbers {
    
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1 , 3 ,10 , 11 , 55 , 9);
        
        int finalResult = 
                    list.stream()
                        .reduce(1, (x , y) -> x * y);

        System.out.println(finalResult);
                        
    }
}
