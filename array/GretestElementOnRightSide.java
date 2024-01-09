public class GretestElementOnRightSide {
    public static void main(String[] args) {
        int[] nums = { 17, 18, 5, 4, 6, 1 };
        int[] result = replaceElements(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] replaceElements(int[] nums) {
        int[] resultArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < nums.length - 1; j++) {
                    System.out.print(nums[j] + " ");
                if (nums[j] > nums[j + 1] && max < nums[j]) {
                    max = nums[j];
                }
            }
            System.out.println();
            resultArray[i] = max;
        }
        return resultArray;
    }
}
