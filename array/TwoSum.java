import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int[] result = twoSumTwo(nums, 9);
        for (int value : result) {
            System.out.println(value);
        }
    }

    public static int[] twoSumOne(int[] nums, int target) {
        int[] resultArray = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    resultArray[0] = i;
                    resultArray[1] = j;
                }
            }
        }
        return resultArray;
    }

    public static int[] twoSumTwo(int[] nums, int target) {
        int[] resultArray = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if(map.containsKey(num)) {
                resultArray[0] = map.get(num);
                resultArray[1] = i; 
            }

            map.put(nums[i], i);
        }
        return resultArray;
    }
}
