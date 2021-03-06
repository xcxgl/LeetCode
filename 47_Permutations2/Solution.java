import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if(nums.length == 0)
        	return list;
    	int[] flags = new int[nums.length];
    	List<Integer> tempList = new ArrayList<Integer>();
    	backTrack(list, nums, flags, tempList);
        return list;
    }
    
    void backTrack(List<List<Integer>> list, int[] nums, int[] flags, List<Integer> tempList){
    	if(tempList.size() == nums.length){
    		list.add(new ArrayList<Integer>(tempList));
    		return;
    	}
    	for(int i = 0; i < nums.length; i++){
    		if(flags[i] == 1)
    			continue;
    		if(i > 0 && nums[i] == nums[i-1] && flags[i-1] == 1)
    			continue;
    		tempList.add(nums[i]);
    		flags[i] = 1;
    		backTrack(list, nums, flags, tempList);
    		tempList.remove(tempList.size() - 1);
    		flags[i] = 0;
    	}
    }
    
    public static void main(String[] args){
    	int[] nums = {1,1,1};
    	List<List<Integer>> list = new Solution().permute(nums);
    	System.out.println(list);
    	
    }
}