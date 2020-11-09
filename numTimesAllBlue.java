/*
There is a room with n bulbs, numbered from 1 to n, arranged in a row from left to right. Initially, all the bulbs are turned off.

At moment k (for k from 0 to n - 1), we turn on the light[k] bulb. A bulb change color to blue only if it is on and all the previous bulbs (to the left) are turned on too.

Return the number of moments in which all turned on bulbs are blue.
*/

class Solution {
    public int numTimesAllBlue(int[] light) {
        int answer = 0, sum = 0, blueLight = 0;
        for(int i = 0; i < light.length; i++) {
            sum += (i + 1);
            //1, 3, 6, 10, 15 
            blueLight += light[i];
            //2, 3, 6, 11, 15
            if(sum == blueLight) answer++;
        }
        return answer;
    }
}
