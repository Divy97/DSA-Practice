import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        // int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        int nums[] = { 100, 4, 200, 1, 3, 2 };
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 0;
        int ans = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] - 1) {
                count++;
            } else if (nums[i] < nums[i + 1] - 1) {
                count = 0;
            }
            ans = Math.max(ans, count);
        }
        return ans + 1;
    }
}