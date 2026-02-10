/*
Problem: Two Sum
Link: https://leetcode.com/problems/two-sum/

Approach:
- Store each number with its index in a HashMap
- For every number, check if the required pair already exists

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
 // checking if the required number already appeared
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
