/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21
*/
class Solution {
    public int reverse(int x) {
        String stringAns = "";
        String num =  String.valueOf(x);
        boolean neg = false;
        for(int i = num.length()-1; i >= 0; i--) {
            if(num.charAt(i) == '-') {
                neg = true;
                break;
            }
            stringAns += num.charAt(i);
        }
        if(neg == true) stringAns = "-" + stringAns;
        long ans = Long.parseLong(stringAns);
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return 0;
        return (int) ans;
    }
}
