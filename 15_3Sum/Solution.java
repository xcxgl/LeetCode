public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List list = new ArrayList<List<Integer>>();
        if(nums.length < 3)
        	return list;
        Arrays.sort(nums);//��������
        int i = 0;
        //��һ����������������С�ģ�ֻ�迼��С�ڵ���0������
        while(i < nums.length - 2 && nums[i] <= 0){
        	int j = nums.length - 1;
        	//�������������ģ�ֻ�迼�Ǵ��ڵ���0������
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
        		//�����ظ�������
        		while(nums[j] == nums[j + 1] && j >= 2)
        			j--;
        	}
        	i++;
        	//�����ظ�������
        	while(nums[i] == nums[i - 1] && i < nums.length - 2)
        		i++;
        }
        return list;
    }
}