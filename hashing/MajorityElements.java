package hashing;
// Given the Integer array of size n, find all the elements that 

import java.util.HashMap;
import java.util.Map;

// appears more than [n/3] times 

//example :- 
// nums[] = {1,3,2,5,1,3,1,5,1} 
// output :- 1

//nums[] = {1,2}
// output :- 1,2

public class MajorityElements {
    public static void main(String[] args) {
        int[] nums = { 1, 2 };
        printMajorityElementsTwo(nums);
    }

    public static void printMajorityElementsOne(int[] nums) {
        int count;
        int length = 0;
        int[] resultArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > (nums.length / 2)) {
                boolean found = false;
                for (int k = 0; k < length; k++) {
                    if (resultArray[k] == nums[i]) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    resultArray[length] = nums[i];
                    length++;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.println(resultArray[0]);
        }
    }

    public static void printMajorityElementsTwo(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > (nums.length / 3)) {
                System.out.println(e.getKey());
            }
        }
    }
}
