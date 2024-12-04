import java.util.HashSet;
import java.util.Set;


public class Main {
    
    public static boolean hasUniqueChars(String value){
        
        // Set<Character> list = new HashSet<>();
        // char[] characters = value.toCharArray();
        // for(Character i : characters){
        //     list.add(i);
        // }
        // if(list.size() == characters.length){
        //     return true;
        // }else{
        //     return false;
        // }

        Set<Character> list = new HashSet<>();
        for(char ch : value.toCharArray()){
            if(list.contains(ch)){
                return false;
            }
            list.add(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false
            
        */
        
    }
    
}

