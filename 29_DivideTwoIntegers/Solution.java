public class Solution {
    public int divide(int i_dividend, int i_divisor) {
    	if(i_dividend == Integer.MIN_VALUE && i_divisor == -1)
			return Integer.MAX_VALUE;
    	if(i_divisor == 0)
    		return Integer.MAX_VALUE;
		int quotient = 0;//ÉÌ
		int sign = 1;//Õý¸ººÅ
		long dividend = (long)i_dividend;
		long divisor = (long)i_divisor;
		if(dividend < 0 && divisor > 0){
			sign = -1;
			dividend = 0 - dividend;
		}
		else if(dividend > 0 && divisor < 0){
			sign = -1;
			divisor = 0 - divisor;
		}
		else if(dividend < 0 && divisor < 0){
			dividend = 0 - dividend;
			divisor = 0 - divisor;
		}
		long[] divisorArr = new long[32];
		divisorArr[0] = divisor;
		for(int i = 1; i < 32; i++){
			divisorArr[i] = divisorArr[i-1] << 1;
		}
		while(divisor <= dividend){
			int i = 0;
			while(i < 32 && divisorArr[i] <= dividend)
				i++;
			dividend = dividend - divisorArr[i-1];
			quotient = quotient + (1 << (i-1));
		}
		
		return sign * quotient;
		
    }
    public static void main(String[] args){
    	Solution s = new Solution();
    	System.out.println(s.divide(2147483647, 2));
    }
}