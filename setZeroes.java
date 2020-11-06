/*
Given an m x n matrix. If an element is 0, set its entire row and column to 0. Do it in-place.

Follow up:

A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
*/

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        
        for(int i = 0; i < row.length; i++){
            if(row[i] == true) {
                for(int k = 0; k < matrix[i].length;k++){
                    matrix[i][k] = 0;
                }
            }
        }
        
        for(int i = 0; i < col.length; i++){
            if(col[i] == true) {
                for(int k = 0; k < matrix.length;k++){
                    matrix[k][i] = 0;
                }
            }
        }
    }
}
