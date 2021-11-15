package main;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length - 1;
        int[] answer = {0,0};
        
        for (int i = 0; i < length; i++) {
//        	if (nums[i] <= target) {
        		
        		for (int j = i + 1; j <= length; j++) {
//        			if (nums[j] <= target) {
        				
        				if (nums[i] + nums[j] == target) {
        					answer[0] = i;
        					answer[1] = j;
        					break;
        				}
        				
//        			}
        		}
        		
//        	}
        }
        
        return answer;
    }
}