public class Solution {
    public String longestPalindrome(String s) {
       int max = -1;
		int start = 0;
		int end = 0;
		for(int i = 0; i < s.length(); i++){
			int l1 = expand(s, i, i);//aba
			int l2 = expand(s, i, i + 1);//abba
			int length = Math.max(l1, l2);
			if(length > max){
				max = length;
				start = i - (length - 1) / 2;
				end = i + length / 2;
			}
				
		}
       
        return s.substring(start, end + 1);//ע��endӦ+1��"abc".substring(0,1)��'a'
    }
    
	//���м��������������죬���Ը��ַ�Ϊ���ĵĻ����ִ�
	private int expand(String s, int left, int right){
		int i = left;
		int j = right;
		while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
			j++;
			i--;
		}
		return j - i - 1;
	}
}