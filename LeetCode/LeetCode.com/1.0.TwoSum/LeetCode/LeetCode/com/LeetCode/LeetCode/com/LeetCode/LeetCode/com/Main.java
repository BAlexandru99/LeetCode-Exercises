public class Main {
    public static void main(String[] args) {
        int [] nums = {3 , 3};
        int target = 6;
        
        int[] values = twoSum(nums, target);
        for(int i = 0 ; i < values.length ; i++){
            System.out.println(values[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int firstValue = 0;
        int secondValue = 0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] + nums [i+1] == target){
                firstValue = i;
                secondValue = i + 1;
            }
        }
        int[] result = {firstValue , secondValue};
        return result;
    }
}
