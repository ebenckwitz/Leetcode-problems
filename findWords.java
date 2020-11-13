/*
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
*/

import java.util.*;
class Solution {
    public String[] findWords(String[] words) {
        char[] row1 = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] row2 = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] row3 = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        List<String> ans = new ArrayList<String>();  
        
        for(int i = 0; i < words.length; i++) {
            int count1 = 0, count2 = 0, count3 = 0;
            for(int k = 0; k < words[i].length(); k++) {
                char letter = words[i].charAt(k);
                letter = Character.toLowerCase(letter);
                if(check(row1, letter)){
                  count1++;  
                }else if(check(row2, letter)){
                  count2++;  
                }else{
                  count3++;  
                } 
            }
            if(count1 == words[i].length() || count2 == words[i].length() || count3 == words[i].length()){
                ans.add(words[i]);
            }
        }
        String[] answer = ans.toArray(new String[ans.size()]);
        return answer;
    }
    
    public static boolean check(char[] row, char letter) {
      for(int i = 0; i < row.length; i++) {
        if(row[i] == letter) return true;
      }
      return false;
    }
}
