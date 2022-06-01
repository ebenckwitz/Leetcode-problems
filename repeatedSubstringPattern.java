/*
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
Example 2:
Input: s = "aba"
Output: false
Example 3:
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
*/
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // if(s.length() < 3) return false;
        // for(int i = 0; i < s.length()-1; i = i + 2) {
        //     String sub = s.charAt(i) + "" + s.charAt(i+1);
        //     System.out.println("i is " + i);
        //     for(int j = 2; j < s.length()-1; j++) {
        //         System.out.println("j is " + j);
        //         String check = s.charAt(j) + "" + s.charAt(j+1);
        //         System.out.println(sub + " " + check);
        //         if(check.equals(sub)) return true;
        //     }
        // }
        // return false;
      
        String a1=s+s;
        String a2=a1.substring(1,a1.length()-1);
        System.out.println("a1 " +a1+ "\na2 " +a2);
        if(a2.contains(s)) return true;
        else return false;
    }
}
//My answer would come out wrong, learned about this smart solution in discussion.
