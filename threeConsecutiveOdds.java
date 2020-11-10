/*
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
*/

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 3;
        for(int n : arr){
            if(n % 2 != 0){
                count--;
                if(count == 0) return true;
            }else count = 3;
        }
        return false;
    }
}
