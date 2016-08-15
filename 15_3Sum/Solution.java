public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List list = new ArrayList<List<Integer>>();
        if(nums.length < 3)
        	return list;
        Arrays.sort(nums);//升序排序
        int i = 0;
        //第一个数是三个数中最小的，只需考虑小于等于0的数字
        while(i < nums.length - 2 && nums[i] <= 0){
        	int j = nums.length - 1;
        	//第三个数是最大的，只需考虑大于等于0的数字
        	while(j > i && j >= 2 && nums[j] >= 0){
        		int third = 0 - nums[i] - nums[j];
        		if(third > nums[j])
        			break;
        		else if(third >= nums[i]){
        			for(int k = i + 1; k < j; k++){
        				if(nums[k] == third){
        					ArrayList<Integer> temp = new ArrayList<Integer>();
        					temp.add(nums[i]);
        					temp.add(nums[k]);
        					temp.add(nums[j]);
        					list.add(temp);
        					break;
        				}
        			}
        		}
        		j--;
        		//跳过重复的数字
        		while(nums[j] == nums[j + 1] && j >= 2)
        			j--;
        	}
        	i++;
        	//跳过重复的数字
        	while(nums[i] == nums[i - 1] && i < nums.length - 2)
        		i++;
        }
        return list;
    }
}