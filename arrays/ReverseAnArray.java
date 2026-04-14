 */
Approach: 
- Use two pointers
- initialize two pointers
- Traverse array and swap them until left pointer less than right pointer

Time Complexity: O(n)
Space Complexity: O(1)
*/
  class Solution {
    public void reverseArray(int arr[]) {
       
int left=0;
int right = arr.length-1;
while(left<right){
    int temp = arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
    left++;
    right--;
}

    }
}
