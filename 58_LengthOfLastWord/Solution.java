public class Solution {
	public int lengthOfLastWord(String s) {
        int length = 0;
        int i = 0;
        for(i = s.length()-1; i >= 0; i--){
        	if(s.charAt(i) != ' ')
        		break;
        }
        if(i == -1)
        	return 0;
        for(int j = i; j >= 0; j--){
        	if((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || 
        			(s.charAt(j) >= 'A' && s.charAt(j) <= 'Z'))
        		length++;
        	else
        		break;
        }
        
        return length;
    }
	
	
	public static void main(String[] args){
		String s = "  aaa  ";
		System.out.print(new Solution().lengthOfLastWord(s));
	}
}