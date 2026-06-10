public class Solution {
    public int search(int[] nums, int target) {

        // Simple built in func Soln: 
        int index = Arrays.binarySearch(nums, target);
        return index >= 0 ? index : -1;
    }
}