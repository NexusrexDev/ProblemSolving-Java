/**
 * Problem name: Find the Duplicate Number
 * Problem link: https://leetcode.com/problems/find-the-duplicate-number
 */

package LeetCode;

public class FindDuplicateNumber {
    /*Since LeetCode uses a method for the solution instead of the main,
    * I'll just copy my code from the solution
    */
    public int findDuplicate(int[] nums) {
        int[] x = new int[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            x[nums[i] - 1]++;
            if (x[nums[i] - 1] > 1) {
                return nums[i];
            }
        }
        return -1;
    }
}