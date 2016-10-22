import java.util.*;

public class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i = 0; i < strs.length; i++){
        	char[] temp = strs[i].toCharArray();
        	Arrays.sort(temp);
        	String tempStr = String.valueOf(temp);
        	if(map.containsKey(tempStr)){
        		map.get(tempStr).add(strs[i]);
        	}
        	else{
        		List<String> tempList = new ArrayList<String>();
        		tempList.add(strs[i]);
        		map.put(tempStr, tempList);
        	}
        }
        //map to list
        for(String str : map.keySet()){
        	res.add(map.get(str));
        }
        return res;
    }
	
	public static void main(String[] args){
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> res = new Solution().groupAnagrams(strs);
		for(int m = 0; m < res.size(); m++){
			for(int n = 0; n < res.get(m).size(); n++)
				System.out.print(res.get(m).get(n) + " ");
			System.out.println();
    	}
	}
}