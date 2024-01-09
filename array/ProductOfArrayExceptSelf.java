public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        // int[] nums = { -1, 1, 0, -3, 3 };
        int[] nums = { 1, 2, 3, 4 };
        // int[] resultArray = productExceptSelf(nums);
        int[] resultArray = productExceptSelfTwo(nums);

        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] resultArray = new int[nums.length];
        int mul = 1;
        int i = 0;
            int left = i - 1;
            int right = i + 1;
            while (right <= nums.length - 1) {
                mul = mul * nums[right];
                right++;
            }

            while (left >= 0) {
                mul = mul * nums[left];
                left--;
            }

            resultArray[i++] = mul;
        // 
        
        return resultArray;
    }

    public static int[] productExceptSelfTwo(int[] nums) {
        int[] result = new int[nums.length];
        int prefix = 1;
        int postfix = 1;

        for (int i = 0; i < nums.length; i++) {
           result[i] = prefix;
           prefix = prefix * nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
          result[i] = result[i] * postfix;
          postfix = postfix * nums[i];
        }

        return result;
    }
}
