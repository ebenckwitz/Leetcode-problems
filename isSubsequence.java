/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) 
of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
*/

import java.util.*;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int num = 0;
        int length = s.length();
        for(int j = 0; j < t.length(); j++) {
            if(num == length) {
                return true;
            }
            if(s.charAt(num) == t.charAt(j)) {
                num++;
            }
        }
        if(num == length) {
            return true;
        }
        return false;
    }
}
