class Solution {
    public int removeDuplicates(int[] nums) {
        int u = 0;
        
    	int n = nums.length;
        
        for (int i = 0; i < n; i++) {
        	if (u == 0 || isUnique(nums, u, i)) {
        		nums[u] = nums[i];
        		u++;
        	}
        }
    	
    	return u;
    }

	private boolean isUnique(int[] nums, int u, int x) {		
		for (int i = 0; i < u; i++) 
			if (nums[i] == nums[x]) return false;
		
		return true;
	}
}