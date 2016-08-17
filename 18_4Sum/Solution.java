public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
		ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
		if(nums.length < 4)
			return list;
		Arrays.sort(nums);
		//skip little numbers
		int min = 0;
		while(min < nums.length - 4 && nums[min] + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] < target)
			min++;
		//skip large numbers
		int max = nums.length - 1;
		while(max > 0 && nums[max] + nums[0] + nums[1] + nums[2] > target)
			max--;
		int i = min;
		while(i < max - 2){
			int j = i + 1;
			while(j < max - 1){
				int m = j + 1;
				int n = max;
				while(m < n){
					if(nums[i] + nums[j] + nums[m] + nums[n] == target){
						List<Integer> tempList = new ArrayList<Integer>();
						tempList.add(nums[i]);
						tempList.add(nums[j]);
						tempList.add(nums[m]);
						tempList.add(nums[n]);
						list.add(tempList);
						m++;
						while(m < n && nums[m] == nums[m - 1]) 
							m++;
						n--;
						while(m < n && nums[n] == nums[n + 1]) 
							n--;
					}
					else if(nums[i] + nums[j] + nums[m] + nums[n] > target)
						n--;
					else
						m++;
				}
				j++;
				while(j < max - 1 && nums[j] == nums[j - 1]) 
					j++;
			}
			i++;
			while(i < max - 2 && nums[i] == nums[i - 1])
				i++;
		}
		return list;
    }
}