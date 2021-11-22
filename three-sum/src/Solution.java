import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> answer = new ArrayList<>();
    	int length = nums.length;
    	
    	if (length < 3) return answer;
    	
    	Arrays.sort(nums);
    	
    	for (int i = 0; i < length - 2; i++) {
    		int x = nums[i];
    		if (i > 0 && x == nums[i-1]) continue;
    		if (x > 0) break;
    		
    		int j = i + 1;
    		int k = length - 1;
    		
    		while (j < k) {
    			int y = nums[j];
    			int z = nums[k];

                if (x+y+z == 0) {
    				List<Integer> sum = new ArrayList<>();
    				sum.add(x);
    				sum.add(y);
    				sum.add(z);
    				answer.add(sum);
    				
    				j++;
    				k--;
    				while (j < k && nums[j] == nums[j-1])
    					j++;
    				while (j < k && nums[k] == nums[k+1])
    					k--;
    			} else if (x + y + z < 0) {
    				j++;
    			} else {
    				k--;
    			}
    		}
    		
    	}
    	
        return answer;
    }
}