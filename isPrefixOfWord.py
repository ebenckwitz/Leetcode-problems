'''
Given a sentence that consists of some words separated by a single space, and a searchWord.

You have to check if searchWord is a prefix of any word in sentence.

Return the index of the word in sentence where searchWord is a prefix of this word (1-indexed).

If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.

A prefix of a string S is any leading contiguous substring of S.
'''

class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        count = 0
        word = sentence.split(" ")
        for i in word:
            if i.startswith(searchWord):
                return count + 1
            else: count += 1
        return -1
    
