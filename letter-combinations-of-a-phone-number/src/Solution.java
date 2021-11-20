import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        
    	if (digits.isEmpty()) return new ArrayList<>();
    	
    	ArrayList<String> combination = new ArrayList<>();
    	combination.add("");
    	
    	for (int i = 0; i < digits.length(); i++) {
    		combination = addNext(combination, digits.charAt(i));
    	}
    	
    	return combination;
    }

	private ArrayList<String> addNext(ArrayList<String> combination, char c) {
		ArrayList<String> newCombination = new ArrayList<>();
		
		String mapping = getMapping(c);
		for (String str : combination) {
			for (int j = 0; j < mapping.length(); j++) {
				newCombination.add(str.concat(String.valueOf(mapping.charAt(j))));
			}
		}
		
		return newCombination;
	}

	private String getMapping(char c) {
		switch (c) {
			case '2': return "abc";
			case '3': return "def";
			case '4': return "ghi";
			case '5': return "jkl";
			case '6': return "mno";
			case '7': return "pqrs";
			case '8': return "tuv";
			case '9': return "wxyz";
		}
		return null;
	}
}