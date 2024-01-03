import java.util.*;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        if (n == 1) {
            result.add(Arrays.asList(nums[0]));
            return result;
        }

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        while (!map.isEmpty()) {
            List<Integer> curr = new ArrayList<>();
            Set<Integer> keysToRemove = new HashSet<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (value > 0) {
                    curr.add(key);
                    map.put(key, value - 1);
                    if (value == 1) {
                        keysToRemove.add(key);
                    }
                }
            }
            result.add(curr);
            for (int key : keysToRemove) {
                map.remove(key);
            }
        }

        return result;
    }
}