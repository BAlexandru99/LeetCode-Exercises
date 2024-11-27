package firstNonRepeatingCharHashMap;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

                
    }
        
 private static Character firstNonRepeatingChar(String string) {
    //     char[] letters = string.toCharArray(); 
    //     for(int i = 1 ; i < letters.length ; i++){
    //         if(letters[0] == letters[i]){
    //             return null;
    //         }
    //     }
    // return letters[0];
        HashMap <Character, Integer> charCounts = new HashMap<>();

        for(int i = 0 ; i < string.length(); i++){
            char c = string.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c , 0) + 1);
        }

        for(int i = 0 ; i < string.length(); i++){
            char c = string.charAt(i);
            if(charCounts.get(c) == 1){
                return c;
            }
        }
        return null;
    }

}

