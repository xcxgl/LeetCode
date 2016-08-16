public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        Map<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        if("".equals(digits))
        	return list;
        combine(list, digits, 0, "", map);
        return list;
    }
	
	private void combine(List list, String digits, int loc, String sub, Map<Character, String> map){
		if(loc == digits.length()){
			list.add(sub);
			return;
		}
		String chars = map.get(digits.charAt(loc));
		for(int i = 0; i < chars.length(); i++){
			combine(list, digits, loc + 1, sub + chars.charAt(i), map);
		}
	}
	
}