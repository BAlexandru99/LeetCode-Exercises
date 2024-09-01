import java.util.*;
import java.util.stream.Collectors;

public class ConvertLetterLowercase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("APPLES" , "SUSHI" , "PIZZA" , "CAT");
        List<String> finalList 
                        = list.stream()
                                .map(x -> x.toLowerCase())
                                .collect(Collectors.toList());
        for(String print : finalList){
            System.out.println(print);
        }     
    }
}
