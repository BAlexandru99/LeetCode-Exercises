import java.util.*;
import java.util.List;


public class Main {
    
    public static int longestConsecutiveSequence (int [] nums){
        
        List<Integer> lista = new ArrayList<>();
        for (int i : nums) {
            lista.add(i);
        }
        Collections.sort(lista);

        Set<Integer> finalList = new LinkedHashSet<>(lista);

        List<Integer> sortedList = new ArrayList<>(finalList);

        int longestStreak = 0;
        int currentStreak = 1;

        for (int i = 1; i < sortedList.size(); i++) {
            if (sortedList.get(i) == sortedList.get(i - 1) + 1) {
                currentStreak++;
            } else {
                longestStreak = Math.max(longestStreak, currentStreak);
                currentStreak = 1; 
            }
        }

    longestStreak = Math.max(longestStreak, currentStreak);

    return longestStreak;
}


    // WRITE LONGESTCONSECUTIVESEQUENCE METOHOD HERE //
    //                                               //
    //                                               //
    //                                               //
    //                                               //
    ///////////////////////////////////////////////////





    public static void main(String[] args) {
        testLongestConsecutiveSequence("Consecutive Integers", new int[] {1, 2, 3, 4, 5}, 5);
        testLongestConsecutiveSequence("No Sequence", new int[] {1, 3, 5, 7, 9}, 1);
        testLongestConsecutiveSequence("Duplicates", new int[] {1, 2, 2, 3, 4}, 4);
        testLongestConsecutiveSequence("Negative Numbers", new int[] {1, 0, -1, -2, -3}, 5);
        testLongestConsecutiveSequence("Empty Array", new int[] {}, 0);
        testLongestConsecutiveSequence("Multiple Sequences", new int[] {1, 2, 3, 10, 11, 12, 13}, 4);
        testLongestConsecutiveSequence("Unordered Elements", new int[] {5, 1, 3, 4, 2}, 5);
        testLongestConsecutiveSequence("Single Element", new int[] {1}, 1);
        testLongestConsecutiveSequence("All Identical Elements", new int[] {2, 2, 2, 2, 2}, 1);
    }
    
    /**
     * Test method for longestConsecutiveSequence.
     * @param title Title of the test
     * @param nums Input array
     * @param expected Expected result
     */
    private static void testLongestConsecutiveSequence(String title, int[] nums, int expected) {
        System.out.println("Test: " + title);
        System.out.print("Testing array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    
        int result = longestConsecutiveSequence(nums);
        System.out.println("Expected longest streak: " + expected);
        System.out.println("Actual longest streak: " + result);
    
        if (result == expected) {
            System.out.println("PASS\n");
        } else {
            System.out.println("FAIL\n");
        }
    }

}
