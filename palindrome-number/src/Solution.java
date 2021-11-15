
public class Solution {
	public boolean isPalindrome(int x) {
		String s = Integer.toString(x);
		String[] a = s.split("");
		
		int length = a.length;
		for (int i = 0; i < length / 2; i++) {
			if (a[i].equals(a[length - i - 1]) == false) return false;
		}
		
		return true;
	}
}
