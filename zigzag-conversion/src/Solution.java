
class Solution {
	public String convert(String s, int numRows) {
		if (numRows == 1) return s;
		
		String[] rows = new String[numRows];
		for (int x = 0; x < numRows; x++) rows[x] = "";
		
		int i = 0;
		int row = 0;
		boolean zigzagging = false;
		
		int length = rows.length;
		while (i < s.length()) {
			rows[row] += String.valueOf(s.charAt(i));
			
			if (!zigzagging) {
				if (row < length - 1) {
					row++;
				} else {
					row--;
					zigzagging = true;
				}
			} else {
				if (row > 0) {
					row--;
				} else {
					row++;
					zigzagging = false;
				}
			}
			
			i++;
		}
		
		String answer = "";
		for (int j = 0; j < numRows; j++) {
			answer = answer + rows[j];
		}
		
		return answer;
	}
}
