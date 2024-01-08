// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 4, 0, 0, 0 };
        int[] nums2 = { 1, 4 };

        merge(nums1, nums1.length, nums2, nums2.length);
        for (int value : nums1) {
            if(value != 0) {
                System.out.println(value + " ");
            }
        }

        for (int value : nums2) {
            if(value != 0) {
                System.out.println(value + " ");
            }
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int right = 0;
        int index = 0;
        int[] resultArray = new int[m + n];

        while (left < m && right < n) {
            if (nums1[left] < nums2[right]) {
                resultArray[index++] = nums1[left++];
            } else {
                resultArray[index++] = nums2[right++];
            }
        }

        while (left < m) {
            resultArray[index++] = nums1[left++];
        }

        while (right < n) {
            resultArray[index++] = nums2[right++];
        }

        for (int i = 0; i < m + n; i++) {
            if (i < m) {
                nums1[i] = resultArray[i];
            } else {
                nums2[i - m] = resultArray[i];
            }
        }
    }
}
