class Solution {
    public int myAtoi(String s) {
        if (s.isEmpty()) return 0;
        
    	int x = 0;
    	String str = "";
    	
    	boolean checkWhitespace = true;
    	boolean checkSign = true;
    	
    	boolean isPositive = true;
    	char c = ' ';
    	int i = 0;
    	int n = s.length();
    	
    	while (checkWhitespace && i < n) {
    		c = s.charAt(i);
    		
    		if (c == ' ') {
    			i++;
    			continue;
    		}
    		
    		checkWhitespace = false;
    	}
        
        if (i == n) return 0;
    	
    	while (checkSign) {
    		c = s.charAt(i);
    		
    		if (c == '-') {
    			i++;
				isPositive = false;
    		} else if (c == '+')
                i++;
    		
    		checkSign = false;
    	}
        
        if (i == n) return 0;

    	while (i < n) {
    		c = s.charAt(i);
    		if (Character.isDigit(c))
				str += Character.toString(c);
			else
                break;
    		
			i++;
    	}
    	
    	if (str.isEmpty()) return 0;
    	
    	try {
    		x = Integer.valueOf(str);
    		if (!isPositive)
    			x = -x;
    	}
    	catch (Exception e) {
    		if (isPositive)
    			return Integer.MAX_VALUE;
    		else
    			return Integer.MIN_VALUE;
    	}
    	
        return x;
    }
}