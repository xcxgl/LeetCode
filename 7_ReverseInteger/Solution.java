public class Solution {
    public int reverse(int x) {
        int flag = 0;//负数
        int result = 0;
		//把负数转换成绝对值处理
        if(x < 0){
        	flag = -1;
        	x = 0 - x;
        }
       while(x > 0){
        	int result1 = result * 10 + x % 10;
			//溢出的情况下，if不成立，return 0
        	if((result1 - x % 10 ) / 10 == result)
        		result = result1;
        	else 
        		return 0;
        	x = x / 10;
        }
		if(flag == -1)
			return 0 - result;
		else 
			return result;
    }
}