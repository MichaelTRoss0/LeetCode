import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	ArrayList<List<Integer>> answer = new ArrayList<>();
    	
    	int length = nums.length;
    	
    	if (length < 3) return answer;
    	
    	Arrays.sort(nums);
    	
    	for (int i = 0; i < length - 2; i++) {
    		int x = nums[i];
    		if (x > 0) break;
    		
    		for (int j = i+1; j < length - 1; j++) {
    			int y = nums[j];
    			if (x + y > 0) break;
    			
    			for (int k = j+1; k < length; k++) {
    				int z = nums[k];
    				if (z < 0) continue;
    				
    				if (x + y + z == 0) {
    					ArrayList<Integer> sum = new ArrayList<>(3);
    					sum.add(x);
    					sum.add(y);
    					sum.add(z);
    					
    					if (!answer.contains(sum)) answer.add(sum);
    				}
    			} // End of third for loop
    		} // End of second for loop
    	} // End of first for loop
    	
        return answer;
    }
}