class Solution {
    public String longestPalindrome(String s) {
    	if (s == null || s.length() < 1) return "";
    	
        String palindrome = "";
        int longest = 0;
        
        int length = s.length();
        for (int i = 0; i < length; i++) {
        	// TODO Check for palindromes
        }
        
//        for (int i = 0; i < length; i++) {
//        	for (int j = i + 1; j <= length; j++) {
//        		String sub = s.substring(i, j);
//        		if (sub.length() > longest && isPalindrome(sub)) {
//        			palindrome = sub;
//        			longest = palindrome.length();
//        		}
//        	}
//        }
    	
    	return palindrome;
    }

	private boolean isPalindrome(String s) {
		String[] a = s.split("");
		
		int length = a.length;
		for (int i = 0; i < length / 2; i++) {
			if (a[i].equals(a[length - i - 1]) == false) return false;
		}
		
		return true;
	}
}