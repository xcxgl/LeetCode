public class Solution {
    public int lengthOfLongestSubstring(String s) {
      Map<Integer, Character> map = new HashMap<>();
        int max = 0;
        int flag = 0;
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(map.containsValue(c)){
				if(map.size() > max){
					max = map.size();
				}
				int j = 0;
				for(j = flag; !map.get(j).toString().equals(c+""); j++){
					map.remove(j);
				}
				map.remove(j);
				flag = ++j;
			}
			map.put(i, s.charAt(i));
		}
//		if(flag == 0)
//			return s.length();
		return max >= map.size()? max : map.size();
    }
}