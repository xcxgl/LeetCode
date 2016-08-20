public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list =  new ArrayList<String>();
        if(n == 0)
        	return list;
        if(n == 1)
        {
        	list.add("()");
        	return list;
        }
		String parenthesis = "(";
		int left = 1;
		int right = 0;
		combine(list, n, left, right, parenthesis);
		return list;
    }
	private void combine(List<String> list, int n,int left, int right, String parenthesis){
		if(left == n && right == n){
			list.add(parenthesis);
			return;
		}
		if(left < right || left > n || right > n)
			return;
		combine(list, n, left + 1, right, parenthesis + "(");
		combine(list, n, left, right + 1, parenthesis + ")");
    }
}