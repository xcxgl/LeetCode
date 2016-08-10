public class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap();
       for(int j = 0; j < nums.length; j++){
           map.put(nums[j], j);
       }
       
        for(int i = 0; i < nums.length - 1; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp) && map.get(temp) != i){
                return new int[]{i, map.get(temp)};
            }
        }
        //return new int[]{-1,-1};
		throw new IllegalArgumentException("No two sum solution");
    }
}