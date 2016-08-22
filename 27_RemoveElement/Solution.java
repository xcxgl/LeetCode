public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0)
        	return 0;
		int end = nums.length - 1;
		int start = -1;
		while(start < end){
			start++;
			if(nums[start] == val){
				while(end > start && nums[end] == val)
					end--;
				if(end == start)
					return start;
				else{
					nums[start] = nums[end];
					end--;
				}
			}
		}
		return start + 1;
    }
}