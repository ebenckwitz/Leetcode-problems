/*
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
*/

import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intList = new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        for(int i: nums2) {
            intList.add(i);
        }
        for(int i = 0; i < nums1.length; i++) {
            if(intList.contains(nums1[i])) {
                if(!ans.contains(nums1[i])) ans.add(nums1[i]);
            }
        }
        int[] answer = ans.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
