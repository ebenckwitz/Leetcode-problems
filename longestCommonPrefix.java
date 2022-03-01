/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

class Solution {
    public String longestCommonPrefix(String[] str) {
        String ans = "";
        
        for(int i = 0; i < str[0].length(); i++) {
            for(int j = 1; j < str.length; j++) {
                if(i > str[j].length()-1){
                  return ans;  
                } 
                
                if(str[0].charAt(i) != str[j].charAt(i)) {
                    return ans;
                }
            }
            ans += str[0].charAt(i);
        }
        return ans;
    }
}
