public class Solution {
	public boolean canJump(int[] nums) {
		int reachable = 0;
		//judge if position i is reachable 
		for(int i = 0; i < nums.length; i++){
			if(i > reachable)
				return false;
			reachable = Math.max(reachable, i + nums[i]);
			if(reachable >= nums.length - 1)
				return true;
		}
		return true;
	}
	
	
	public static void main(String[] args){
		int[] nums = {0};
		System.out.print(new Solution().canJump(nums));
	}
}