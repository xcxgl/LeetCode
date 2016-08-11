public class Solution {
    public int myAtoi(String str) {
        int i = 0;
		int flag = 0;
		int result = 0;
		//ȥ���ո�
		while (i < str.length() && isWhitespace(str.charAt(i))) {
			i++;
		}
		//ȥ��������
		if (i < str.length() && isPlusOrMinus(str.charAt(i))) {
			if (str.charAt(i) == '-')
				flag = -1;
			else
				flag = 1;
			i++;
		}
		while (i < str.length() && isNum(str.charAt(i))) {
			//�ж��Ƿ����������ﴦ��ò��ã�Ҫѧϰ��������ô�����
			if (((double) 2147483647 - str.charAt(i) + 48) / 10.0 < (double) result) {
				if (flag == 1 || flag == 0)
					return Integer.MAX_VALUE;
				else
					return Integer.MIN_VALUE;
			}
			result = 10 * result + (str.charAt(i) - 48);
			i++;
		}
		if (flag == -1)
			return 0 - result;
		return result;
	}

	private boolean isNum(char c) {
		if (c >= '0' && c <= '9')
			return true;
		else
			return false;
	}

	private boolean isPlusOrMinus(char c) {
		if (c == '+' || c == '-')
			return true;
		else
			return false;
	}

	private boolean isWhitespace(char c) {
		if (c == ' ')
			return true;
		else
			return false;
	}
}