package findDuplicatesHashMap;

import java.util.*;


public class Main {
    
    
    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> finalList = new ArrayList<>();
    
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
    
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                finalList.add(entry.getKey());
            }
        }
    
        return finalList;
    }

    // WRITE THE FINDDUPLICATES METHOD HERE // 
    //                                      //
    //                                      //
    //                                      //
    //                                      //
    //////////////////////////////////////////
      

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates); 
        
        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */
        
    }

}
