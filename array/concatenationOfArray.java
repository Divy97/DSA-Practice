public class concatenationOfArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        int[] ans = getConcatenation(nums);
        for (int value : ans) {
            System.out.print(value + " ");
        }

    }

    public static int[] getConcatenation(int[] nums) {
        int[] resultArray = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            resultArray[i] = nums[i];
            resultArray[i+nums.length] = nums[i];
        }
        return resultArray;
    }
}
