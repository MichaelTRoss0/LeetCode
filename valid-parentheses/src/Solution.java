class Solution {
    public boolean isValid(String s) {
    	if (s.length() % 2 == 1) return false;
    	
    	String placeholder = s;
    	while (placeholder.contains("()") || placeholder.contains("{}") ||
    			placeholder.contains("[]")) {
    		placeholder = placeholder.replaceAll("\\(\\)", "");
    		placeholder = placeholder.replaceAll("\\{}", "");
    		placeholder = placeholder.replaceAll("\\[]", "");
            System.out.println(placeholder);
    	}
    	
    	if (placeholder.isEmpty()) return true; 
    	
        return false;
    }
}