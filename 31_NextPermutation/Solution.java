public class Solution {
    public void nextPermutation(int[] nums) {
        int min_dif = Integer.MAX_VALUE;
        int point = - 1;
        for(int i = nums.length - 2; i >= 0; i--){
           for(int j = i + 1; j < nums.length; j++){
        	   if(nums[j] > nums[i] && (nums[j]-nums[i]) < min_dif){
        		   min_dif = nums[j] - nums[i];
        		   point = j;
        	   }
           }
           if(point != -1){
        	   int temp = nums[i];
        	   nums[i] = nums[point];
        	   nums[point] = temp;
        	   //sort
        	   for(int m = i+1; m < nums.length - 1; m++){
        		   for(int n = m+1; n < nums.length; n++){
        			   if(nums[n] < nums[m]){
        				   int a = nums[m];
        				   nums[m] = nums[n];
        				   nums[n] = a; 
        			   }
        		   }
        	   }
        	   return;
           }
            
        }
        for(int j = 0; j < nums.length/2; j++){
            int temp = nums[j];
            nums[j] = nums[nums.length-j-1];
            nums[nums.length-j-1] = temp;
        }
        return;
    }
}