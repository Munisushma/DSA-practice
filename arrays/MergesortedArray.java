/* 
problem : Merge sorted Array

Approach:
use three pointers : i,j,k
  i -> last valid postion of nums1
  j -> last position of nums2
  k -> last position of nums1

  Time Complexity : O(m+n)
  Space complexity : O(1)
  */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
   int k =m+n-1;
while(j>=0 && i>=0){
    if(nums1[i]>nums2[j]){
        nums1[k]=nums1[i];
    
        i--;
    }
    
    else{
nums1[k]=nums2[j];
        j--;
     
    }
    k--;
}
   while(j>=0){
    nums1[k]=nums2[j];
    j--;
    k--;
   }
}
}
    
