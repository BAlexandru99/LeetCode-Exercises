package groupAnagramsHashMap;

import java.util.*;


public class Main {
    
    public static List<List<String>>groupAnagrams(String [] strings){
        Map<String , List<String>>anagramGroups = new HashMap<>();
        for(String ar : strings){
            char[] chars = ar.toCharArray();
            Arrays.sort(chars);
            String canonical = new String(chars);
            
            if(anagramGroups.containsKey(canonical)){
                anagramGroups.get(canonical).add(ar);
            }else{
                List<String> group = new ArrayList<>();
                group.add(ar);
                anagramGroups.put(canonical, group);
            }
        }

        return new ArrayList<>(anagramGroups.values());
    }
    
    // WRITE GROUPANAGRAMS METHOD HERE // 
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */
        
    }
    
}