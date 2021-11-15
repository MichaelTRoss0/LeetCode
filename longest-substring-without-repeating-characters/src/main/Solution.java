package main;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        
        int length = s.length();
        for (int i = 0; i < length - 1; i++) {
        	for (int j = i + 1; j < length; j++) {
        		String sub = s.substring(i, j);
        		if (sub.length() > longest && hasNoRepeating(sub)) {
        			longest = sub.length();
        		}
        	}
        }
		
		return longest;
    }

	private static boolean hasNoRepeating(String sub) {
		String[] chars = sub.split("");
		
		int length = chars.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (chars[i].equals(chars[j])) {
					return false;
				}
			}
		}
		
		return true;
	}
}
