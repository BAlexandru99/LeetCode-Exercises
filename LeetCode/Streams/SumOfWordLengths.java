import java.util.*;

public class SumOfWordLengths {
    public static void main(String[] args) {
        String [] lista = {"Apple" , "Bananas" , "Words" , "Book" , "Analog"};
        List <String> newList = Arrays.asList(lista);
        
        int finalList = newList.stream()
                                        .mapToInt(x -> x.length())
                                        .sum();    
        System.out.println(finalList);                                    
    }
}
