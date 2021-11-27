import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        
    	ans = generateAll(ans, 2 * n);
        
        return ans;
    }
    
    private List<String> generateAll(List<String> base, int l) {
    	List<String> lis = new ArrayList<>();
    	
    	String s = "(";
    	lis.addAll(addNext(s, l - 1));
    	
		return lis;
	}
    
    private List<String> addNext(String s, int l) {
    	List<String> next = new ArrayList<>();
    	
    	if (l == 1) {
    		s = s + ")";
    		if (isValid(s))
    			next.add(s);
    	} else {
    		next.addAll(addNext(s + "(", l - 1));
    		next.addAll(addNext(s + ")", l - 1));
    	}
    	
    	return next;
    }
    
    private boolean isValid(String s) {
    	String placeholder = s;
    	while (placeholder.contains("()"))
    		placeholder = placeholder.replaceAll("\\(\\)", "");
    	
    	if (placeholder.isEmpty()) return true; 
    	
        return false;
    }
}