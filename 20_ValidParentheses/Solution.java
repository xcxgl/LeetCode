public class Solution {
    public boolean isValid(String s) {
        String stack = "";
		int s_num = 0;
		//Óöµ½ÓÒÀ¨ºÅÊ±ÅĞ¶Ï£¬Óöµ½×óÀ¨ºÅÖ±½ÓÈëÕ»
		if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == '}')
			return false;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
				stack += s.charAt(i);
				s_num++;
			}
			else{
				if(s_num >0 && match(stack.charAt(s_num - 1), s.charAt(i))){
					s_num--;
					stack = stack.substring(0, s_num);
				}
				else
					return false;
			}
		}
		if("".equals(stack))
			return true;
		return false;
    }
    
	private boolean match(char a, char b){
		if(a == '('){
			if(b == ')')
				return true;
			else
				return false;
		}
		if(a == '{'){
			if(b == '}')
				return true;
			else
				return false;
		}
		if(a == '['){
			if(b == ']')
				return true;
			else
				return false;
		}
		return false;
	}
}