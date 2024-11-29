import java.util.*;


public class Main {
    
    public static int[] twoSum (int[] numbers , int target){
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0 ; i < numbers.length ; i++){
            int number = numbers[i];
            int complement = target - number;
            if(numMap.containsKey(complement)){
                int[] result = {numMap.get(complement), i};
                return result;
            }else{
                numMap.put(number, i);
            }
        }
        return new int[]{};
    }
    

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []

        */
        
    }

}
