/*
Given a m * n matrix mat of ones (representing soldiers) and zeros (representing civilians), return the indexes of the k weakest rows in the matrix ordered from the weakest to the strongest.
A row i is weaker than row j, if the number of soldiers in row i is less than the number of soldiers in row j, or they have the same number of soldiers but i is less than j. 
Soldiers are always stand in the frontier of a row, that is, always ones may appear first and then zeros.
Example 1:

Input: mat = 
[[1,1,0,0,0],
 [1,1,1,1,0],
 [1,0,0,0,0],
 [1,1,0,0,0],
 [1,1,1,1,1]], 
k = 3
Output: [2,0,3]
Explanation: 
The number of soldiers for each row is: 
row 0 -> 2 
row 1 -> 4 
row 2 -> 1 
row 3 -> 2 
row 4 -> 5 
Rows ordered from the weakest to the strongest are [2,0,3,1,4]
*/

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k]; //what we will return
        int[] count  = new int[mat.length]; //to count number of soldiers
        
        //this nested for loop will enter number of soldiers in each row into count
        for(int i = 0; i < mat.length; i ++) {
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1)  count[i]++;
            }
        }

        //this nested loop will  find the k smallest weakest rows
        for(int i = 0; i < k; i++) {
            int num = 0;
            for(int j = 1; j < count.length; j++) {
                if(count[j] < count[num]) num = j;
            }
            ans[i] = num;
            count[num] = Integer.MAX_VALUE;
        }
        return ans;
    }
}
