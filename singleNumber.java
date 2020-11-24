/*
Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

Follow up: Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?

Example 1:
Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.
*/

class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> singles = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(!singles.contains(nums[i])) {
                singles.add(nums[i]);
            }else{
                singles.remove(nums[i]);
            }
        }
        
        int[] ans = new int[2];
        int j = 0;
        for(Integer i : singles) {
            ans[j++] = i;
        }
        return ans;
    }
}
