public class Solution1 {
    public boolean isPalindrome(int x) {
		//���������ڻ���
		if(x < 0){
			return false;
		}
		else if(x < 10)
			return true;
		int x1 = x;
		int i = 0;//����������λ��
		while(x1 > 0){
			x1 = x1 / 10;
			i ++;
		}
		int j = 1;
		int q1 = x;//��
		int q2 = 0;
		int r1 = 0;//����
		int r2 = x;
		while(j <= i / 2){
			r1 = q1 % 10;
			q1 = q1 / 10;
			q2 = r2 / tens(i - j);
			r2 = x % tens(i - j);
			if(r1 == q2){
				j++;
			}
			else
				return false;
		}
		return true;
	}

	private int tens(int i){
		int result = 1;
		while(i > 0){
			result = result * 10;
			i--;
		}
		return result;
	}
}