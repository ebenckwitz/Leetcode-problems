/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
 

Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
*/

import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            int temp = i + 1;
            if(temp % 3 == 0 && temp % 5 == 0) {
                arr[i] = "FizzBuzz";
            } else if(temp % 5 == 0) {
                arr[i] = "Buzz";
            } else if(temp % 3 == 0) {
                arr[i] = "Fizz";
            } else {
                arr[i] = String.valueOf(temp);
            }
        }
        
        List<String> list = Arrays.asList(arr);
        return list;
    }
}
