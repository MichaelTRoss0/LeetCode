import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        int n = nums.length;
        int k = 4;
        
        if (n < k) return answer;
        
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); // Trace
        System.out.println("Length: " + n); // Trace
        System.out.println(); // Trace
        
        int[] curr = new int[k];
        answer = kSum(nums, n, target, k, 0, 0, curr);
        
        return answer;
    }
    
    // n is the length of the nums array
    // k is the number of ints left to test
    // x is the position of the curr array
    // i is the iterator variable
    private List<List<Integer>> kSum(int[] nums, int n, int target, int k, int x, int i, int[] curr) {
    	List<List<Integer>> list = new ArrayList<>();
    	int max = n - k + 1;
    	
    	
    	for ( ; i < max; i++) {
    		curr[x] = nums[i];
    		if (i > 0 && curr[x] == nums[i - 1]) continue;
    		
			if (k > 2)
				list.addAll(kSum(nums, n, target, k - 1, x + 1, i + 1, curr));
			else {
				// TODO Add traces
				list.addAll(twoPoint(nums, target, i + 1, n - 1, curr));
			}
				
		}
		return list;
    }
    
    private List<List<Integer>> twoPoint(int[] nums, int target, int j, int k, int[] curr) {
    	List<List<Integer>> list = new ArrayList<>();
    	int sum = 0;
    	int n = curr.length;
    	
    	while (j < k) {
    		curr[n-2] = nums[j];
    		curr[n-1] = nums[k];
    		
    		sum = takeSum(curr);
            System.out.println(Arrays.toString(curr) + " = " + sum); // Trace
            System.out.println(); // Trace
    		if (sum == target) {
    			List<Integer> group = new ArrayList<>();
    			for (int x : curr)
    				group.add(x);
    			list.add(group);
    			
    			j++;
				k--;
				while (j < k && nums[j] == nums[j-1])
					j++;
				while (j < k && nums[k] == nums[k+1])
					k--;
				
    		} else if (sum < target)
    			j++;
    		else
    			k--;
    	}
    	
    	return list;
    }

	private int takeSum(int[] a) {
		int x = 0;
		
		for (int i : a)
			x += i;
		
		return x;
	}
}