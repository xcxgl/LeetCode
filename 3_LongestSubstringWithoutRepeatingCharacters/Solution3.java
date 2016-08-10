public class Solution {
    public int lengthOfLongestSubstring(String s) {
     Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int flag = 0;
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(map.containsKey(c)){
				flag = Math.max(map.get(c), flag);
			}
			map.put(c, i + 1);
			max = Math.max(max, i - flag + 1);
		}
//		if(flag == 0)
//			return s.length();
		return max;
    }
}