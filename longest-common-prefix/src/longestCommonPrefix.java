class Solution {
    public String longestCommonPrefix(String[] strs) {
    	if (strs.length == 1) return strs[0];
        
        String longest = "";
    	
    	int length = 1;
        boolean going = true;
    	while (going && length <= strs[0].length()) {
    		String sub = strs[0].substring(0, length);
    		
    		for (int i = 1; i < strs.length; i++) {
                
    			if (!strs[i].startsWith(sub)){
                    going = false;
                    break;
                }
    		}
    		
    		if (going) longest = sub;
    		length ++;
    	}
    	
    	return longest;
    }
}