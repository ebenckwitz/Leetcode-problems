/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
*/
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0) return 0;
        boolean space = false;
        int count = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            char letter = s.charAt(i); 
            if((letter >= 'a' && letter <='z') || (letter >= 'A' && letter <='Z')) {
                space = true;
                count++;
            } else {
                if(space)
                    return count;
            }
        }
        return count;
    }
}
