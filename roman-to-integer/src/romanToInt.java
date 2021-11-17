class Solution {
    public int romanToInt(String s) {
    	int total = 0;
    	
    	if (s.contains("M")) {
    		total += convertAll(s, "CM", 900);
    		s = s.replaceAll("CM", "");
        	total += convertAll(s, "M", 1000);
        	s = s.replaceAll("M", "");
    	}
    	
    	if (s.contains("D")) {
			total += convertAll(s, "CD", 400);
			s = s.replaceAll("CD", "");
			total += convertAll(s, "D", 500);
			s = s.replaceAll("D", "");
		}
    	
    	
		if (s.contains("C")) {
			total += convertAll(s, "XC", 90);
			s = s.replaceAll("XC", "");
			total += convertAll(s, "C", 100);
			s = s.replaceAll("C", "");
		}
		
		
		if (s.contains("L")) {
			total += convertAll(s, "XL", 40);
			s = s.replaceAll("XL", "");
			total += convertAll(s, "L", 50);
			s = s.replaceAll("L", "");
		}
		
		if (s.contains("X")) {
			total += convertAll(s, "IX", 9);
			s = s.replaceAll("IX", "");
			total += convertAll(s, "X", 10);
			s = s.replaceAll("X", "");
		}
		
		if (s.contains("V")) {
			total += convertAll(s, "IV", 4);
			s = s.replaceAll("IV", "");
			total += convertAll(s, "V", 5);
			s = s.replaceAll("V", "");
		}
		
		if (s.contains("I")) {
			total += convertAll(s, "I", 1);
			s = s.replaceAll("I", "");
		}
		
		return total;
    }

	private int convertAll(String str, String rn, int val) {
		int x = 0;
		while (str.contains(rn)) {
			x += val;
			str = str.replaceFirst(rn, "");
		}
		
		return x;
	}
}