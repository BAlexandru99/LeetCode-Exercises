import java.util.*;;

public class ConcatenationOfWords {
    public static void main(String[] args) {
        String [] lista = {"Alex" , "are" , "mare" , "."};
        List <String> newList = Arrays.asList(lista);

        String finalList = newList.stream()
                                    .reduce("", (x,y) -> x + "" + y)
                                    .trim();

        System.out.println(finalList);
    }

}
