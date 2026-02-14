/*
Problem: Sort Colors (Dutch National Flag)

Approach:
- Use three pointers: low, mid, high
- 0 → swap with low
- 1 → move mid
- 2 → swap with high
- One-pass solution

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public void sortColors(int[] nums) {
        int low =0;
        int mid=0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }


        }
      
    }
}
