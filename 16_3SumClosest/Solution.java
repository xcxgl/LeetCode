public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = 0;
        Arrays.sort(nums);//ÉıĞòÅÅĞò
        int differ = Integer.MAX_VALUE;
        int i = 0;
        while(i < nums.length - 2){
        	int k = nums.length - 1;
        	int j = i + 1;
        	while(j < k){
        		if(nums[i] + nums[j] + nums[k] == target)
        			return target;
        		else if(nums[i] + nums[j] + nums[k] > target){
        			while(j < k && nums[i] + nums[j] + nums[k] > target)
        				k--;
        			if(Math.abs(nums[i] + nums[j] + nums[k + 1] - target) < Math.abs(differ)){
        				differ = nums[i] + nums[j] + nums[k + 1] - target;
        				closest = nums[i] + nums[j] + nums[k + 1];
        			}
        		}
        		else{
        			while(j < k && nums[i] + nums[j] + nums[k] < target)
        				j++;
        			if(Math.abs(nums[i] + nums[j - 1] + nums[k] - target) < Math.abs(differ)){
        				differ = nums[i] + nums[j - 1] + nums[k] - target;
        				closest = nums[i] + nums[j - 1] + nums[k];
        			}
        		}
        	}
        	i++;
        }
        return closest;
    }
}