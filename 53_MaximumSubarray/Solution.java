public class Solution {
	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
        	sum = nums[i] > sum + nums[i] ? nums[i] : sum + nums[i];
        	if(sum > max)
        		max = sum;
        }
        return max;
    }
	
	public static void main(String[] args){
		int[] nums= {-1,0,-2};
		System.out.println(new Solution().maxSubArray(nums));
	}
}