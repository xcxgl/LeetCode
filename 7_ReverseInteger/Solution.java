public class Solution {
    public int reverse(int x) {
        int flag = 0;//����
        int result = 0;
		//�Ѹ���ת���ɾ���ֵ����
        if(x < 0){
        	flag = -1;
        	x = 0 - x;
        }
       while(x > 0){
        	int result1 = result * 10 + x % 10;
			//���������£�if��������return 0
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