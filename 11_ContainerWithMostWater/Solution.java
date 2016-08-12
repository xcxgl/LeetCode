public class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
        	max = Math.max(max, (j - i) * (height[i] < height[j] ? height[i++]: height[j--]));
        }
		return max;
    }
}