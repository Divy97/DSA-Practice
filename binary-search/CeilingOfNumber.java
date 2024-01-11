public class CeilingOfNumber {
    public static void main(String[] args) {
        // int[] nums = { -1, 0, 3, 5, 9, 12 };
        int[] nums = { 1, 3, 5, 6 };
        char[] letters = { 'c', 'f', 'j' };
        char ansChar = smallestLetterGreaterThanTarget(letters, 'a');
        System.out.println(ansChar);
        int ans = ceilingOfNumber(nums, 4);
        System.out.println(ans);
    }

    public static char smallestLetterGreaterThanTarget(char[] chars, char target) {
        int left = 0;
        int right = chars.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (target < chars[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return chars[left % chars.length];
    }

    public static int ceilingOfNumber(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        if (target < nums[0]) {
            return 0;
        }

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
