class Solution {
    public int maxArea(int[] height) {
    	int area = 0;
    	int left = 0;
    	int right = height.length - 1;
    	
    	while (left < right) {
    		int w = right - left;
    		int l = Math.min(height[left], height[right]);
    		area = Math.max(area, l * w);
    		
    		if (height[left] < height[right])
    			left++;
    		else
    			right--;
    	}
    	
        return area;
    }
}