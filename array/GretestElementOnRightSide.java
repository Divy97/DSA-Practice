public class GretestElementOnRightSide {
    public static void main(String[] args) {
        int[] nums = { 17, 18, 5, 4, 6, 1 };
        // int[] nums = {400};
        int[] result = replaceElementsTwo(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] replaceElements(int[] nums) {
        int[] resultArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int max = -1; 
            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(max, nums[j]);
            }
            resultArray[i] = max;
        }
        return resultArray;
    }

    public static int[] replaceElementsTwo(int[] nums) {
        int[] resultArray = new int[nums.length];
        int newMax = 0;
        int rightMax = -1;
        for(int i=nums.length -1;i>=0;i--) {
            newMax = Math.max(rightMax, nums[i]);
            resultArray[i] = rightMax;
            rightMax = newMax;
        }
        return resultArray;
    }
}
