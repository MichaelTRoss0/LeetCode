import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int answer = 0;
        int closest = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        
        for (int i = 0; i < n - 2; i++) {
        	if (i > 0 && nums[i] == nums[i-1]) continue;
        	
        	int j = i + 1;
        	int k = n - 1;
        	
        	while (j < k) {
        		int sum = nums[i] + nums[j] + nums[k];
        		if (sum == target) return sum;
        		
        		int diff = Math.abs(target - sum);
        		if (diff < closest) {
        			answer = sum;
        			closest = diff;
        		}
                
                if (target - sum > 0)
        			j++;
        		else 
        			k--;
        		
        	}
        }
        
    	return answer;
    }
}