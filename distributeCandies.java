/*
You have n candies, the ith candy is of type candies[i].

You want to distribute the candies equally between a sister and a brother so that each of them gets n / 2 candies (n is even). The sister loves to collect different types of candies, so you want to give her the maximum number of different types of candies.

Return the maximum number of different types of candies you can give to the sister.

 

Example 1:

Input: candies = [1,1,2,2,3,3]
Output: 3
Explanation:
There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too. 
The sister has three different kinds of candies. 
*/

import java.util.Arrays;
class Solution {
    public int distributeCandies(int[] candies) {
        if(candies.length == 2) return 1;
        
        Arrays.sort(candies);
        int max = candies.length / 2;
        int count = 1;
        for(int i = 0; i < candies.length-1; i++) {
            if(candies[i] != candies[i+1]) {
                count++;
                if(count == max) break;
            }
        }
        return count;
    }
}
