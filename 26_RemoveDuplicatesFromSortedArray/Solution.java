public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
        	return 0;
        int i = 1;
        int length = 0;
        while(i < nums.length){
        	if(nums[i] > nums[length]){
        		length++;
        		nums[length] = nums[i];
        	}
        	i++;
        }
    	return length + 1;
    }
}