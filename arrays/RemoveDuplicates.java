/*
Problem: Remove Duplicates from Sorted Array

Approach:
- Use two pointers
- Pointer k keeps track of last unique element
- Traverse array and copy new unique values forward
- Return count of unique elements (k + 1)

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RemoveDuplicates {
public static int removeDup(int [] nums){
		int k=0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]!=nums[k]) {
			k++;
			nums[k]=nums[i];
		}
		}
			return k+1;
	}

