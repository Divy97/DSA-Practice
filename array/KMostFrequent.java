import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KMostFrequent {
    public static void main(String[] args) {
        // int[] nums = { 4,1,-1,2,-1,2,3 };
        // int[] nums = {1};
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int resultArray[] = topKFrequent(nums, 2);
        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int resultArray[] = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], (map.get(nums[i]) + 1));
            } else {
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            queue.add(e);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        int i = k;
        while (!queue.isEmpty()) {
            resultArray[--i] = queue.poll().getKey();
        }

        return resultArray;
    }
}
