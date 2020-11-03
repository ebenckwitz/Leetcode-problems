/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
*/

class Solution {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
             for(int j = 0; j < i+1; j++) {
                 answer[i] += nums[j]; 
             }
        }
        return answer;
    }
}
