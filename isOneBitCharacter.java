/*
We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).

Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.
*/

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean answer = false;
        if(bits.length == 1){
          if(bits[0] == 0){
              return true;
          } else {
              return false;
          }
        } 
        int i = 0;
        while (i < bits.length) {
            if(bits[i] == 1){
                i = i + 2;
                answer = false;
            }else if(bits[i] == 0) {
                i++;
                answer = true;
            } 
        }
        return answer;
    }
}

