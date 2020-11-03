/*
Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.

For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.
*/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<Boolean>();
        int max = 0;
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > max) max = candies[i];
        }
        
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] == max){
              answer.add(true);  
            } else {
                if(candies[i] + extraCandies >= max){
                    answer.add(true);
                } else {
                    answer.add(false);
                }
            } 
        }
        return answer;
    }
}
