/*
Given a string s, return true if s is a good string, or false otherwise.
A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

Example 1:

Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
Example 2:

Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
*/

import java.util.*;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        //make into char list and add the characters from the string
        List<Character> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        //use hashset to find number of ocurrences for each character
        Set<Character> distinct = new HashSet<>(list);
        int count = Collections.frequency(list, s.charAt(0));
        for (Character c: distinct) {
            int temp = Collections.frequency(list, c);
            if(count != temp) return false;
        }

        return true;
    }
}
