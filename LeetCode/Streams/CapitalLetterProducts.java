import java.util.*;


public class CapitalLetterProducts {
    public static void main(String[] args) {
        List<String> lista = List.of("alex" , "cata" , "mere" , "pere" , "pepene");
        Optional <String> finalList = 
            lista.stream()
                .filter(x -> Character.isUpperCase(x.charAt(0)))
                .findFirst();
        
        finalList.ifPresentOrElse(
            x -> System.out.println(x),
            () -> System.out.println("No value"));
    }
}
