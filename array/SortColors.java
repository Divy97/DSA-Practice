import java.util.HashMap;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        HashMap<Integer, Integer> map =  new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            map.put(nums[i],1);
        }
    }
}