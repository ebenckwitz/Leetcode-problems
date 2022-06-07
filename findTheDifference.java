/*
You are given two strings s and t.
String t is generated by random shuffling string s and then add one more letter at a random position.
Return the letter that was added to t.
Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
Example 2:
Input: s = "", t = "y"
Output: "y"
*/

import java.util.*;

class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> list = new ArrayList<Character>();
        boolean repeat = false;
        for(char c : s.toCharArray()) {
            list.add(c);
        }
        
        for(int i = 0; i < t.length(); i++) {
            if(list.contains(t.charAt(i))) {
                list.remove(Character.valueOf(t.charAt(i)));
            } else {
                return t.charAt(i);
            }
        }
        return 'a';
    }
}
