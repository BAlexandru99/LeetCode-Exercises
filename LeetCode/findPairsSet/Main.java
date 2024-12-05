import java.util.*;


public class Main {

    public static List<int[]> findPairs(int[] aar1, int[] arr2, int target){
        // List<int[]> pairs = new ArrayList<>();
        // for(int i : aar1){
        //     for(int y : arr2){
        //         if(i + y == target){
        //             pairs.add(new int[]{i , y});
        //         }
        //     }
        // }
        // return pairs;

        Set<Integer> myList = new HashSet<>();
        List<int[]> finalList = new ArrayList<>();
        for(int i : aar1){
            myList.add(i);
        }

        for(int y : arr2){
            int result = target - y;
            if(myList.contains(result)){
                finalList.add(new int[]{result , y});
            }
        }
        
        return finalList;
    }
    // WRITE FINDPAIRS METHOD HERE // 
    //                             //
    //                             // 
    //                             //
    //                             //
    /////////////////////////////////


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
        
    }

            /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]
            
        */
    
}

    