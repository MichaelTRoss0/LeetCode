package main;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        
        int left = 0;
        int right = 0;
        
        int longest = 0;
        while (right < s.length()) {
        	char r = s.charAt(right);
        	chars[r]++;
        	
        	while (chars[r] > 1) {
        		char l = s.charAt(left);
        		chars[l]--;
        		left++;
        	}
        	
        	longest = Math.max(longest, right - left + 1);
        	
        	right++;
        }
		
		return longest;
    }
}
