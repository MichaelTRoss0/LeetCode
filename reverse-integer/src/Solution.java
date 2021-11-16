
class Solution {
	public int reverse(int x) {
		int y = 0;
		String str = "";
			
		if (x < 0) {
			x = x * -1;
			str = "-";
		}
		
		String temp = Integer.toString(x);
		String[] a = temp.split("");
		
		for (int i = a.length - 1; i >= 0; i--) {
			str = str.concat(a[i]);
		}
		
		try {
			y = Integer.valueOf(str);
		} catch (Exception e) {
			return 0;
		}
		
		return y;
	}
}
