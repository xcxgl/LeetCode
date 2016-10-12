public class Solution {
    public int[] searchRange(int[] nums, int target){
    	int[] range = new int[2];
    	range[0] = -1;
		range[1] = -1;
    	if(nums.length == 0){
    		return range;
    	}
    	int left = 0;
    	int right = nums.length - 1;
    	int mid = -1;
    	//find beginning index
    	while(left <= right){
    		if(left == right){
    			if(nums[left] == target)
    				if(nums[left] == target)
    					range[0] = left;
    			break;
    		}
    		mid = (left + right) / 2;
    		if(nums[mid] >= target)
    			right = mid;
    		else 
    			left = mid + 1;
    	}
    	left = 0;
    	right = nums.length - 1;
    	mid = -1;
    	//find ending index
    	while(left <= right){
    		if(right == left || right == left + 1){
    			if(nums[right] == target)
    				range[1] = right;
    			else if(nums[left] == target)
    				range[1] = left;
    			break;
    		}
    		mid = (left + right) / 2;
    		if(nums[mid] <= target)
    			left = mid;
    		else 
    			right = mid - 1;
    	}
    	
    	return range;
    }
   
    public static void main(String[] args){
    	Solution s = new Solution();
    	int[] nums = {0,2,2,2,2,2,10};
    	int[] range = s.searchRange(nums, 2);
    	System.out.println(range[0] + "  " + range[1]);
    }
}