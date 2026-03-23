/*
Problem : Maximum Average Subarray
  https://leetcode.com/problems/maximum-average-subarray-i/

Approach :
-Used the Sliding Window technique to maintain a running sum of k elements
- By adding the element and removing the previous element
  Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        int windowsum =0;
        for(int i=0;i<k;i++){
            windowsum += nums[i];
        }
        int maxwindow = windowsum;
        for(int i=k;i<nums.length;i++){
            windowsum = windowsum-nums[i-k]+nums[i];
            maxwindow = Math.max(windowsum,maxwindow);

        }
        return (double)maxwindow/k;
    }
}
