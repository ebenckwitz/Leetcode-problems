/*
You are given an array of distinct integers arr and an array of integer arrays pieces, where the integers in pieces are distinct. Your goal is to form arr by concatenating the arrays in pieces in any order. However, you are not allowed to reorder the integers in each array pieces[i].

Return true if it is possible to form the array arr from pieces. Otherwise, return false.
*/

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        String str = "";
        for (int i=0; i<arr.length; i++) {
            str = str + arr[i] + "#";
        }
        
        for (int i=0; i<pieces.length; i++) {
            String str2 = "";
            for (int j=0; j < pieces[i].length; j++) {
                str2 = str2 + pieces[i][j] + "#";
            }
            if (!str.contains(str2)) {
                return false;
            }
        }
        return true;
    }
}
