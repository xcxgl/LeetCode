public class Solution {
    public String longestCommonPrefix(String[] strs) {
       String commonPrefix = "";
		int i = 1;
		if(strs.length > 0){
			int max = strs[0].length();
			while(i < strs.length  && strs[i] != null){
				char[] a = strs[i - 1].toCharArray();
				char[] b= strs[i].toCharArray();
				int common = 0;
				for(int j = 0; j < max && j < a.length && j < b.length; j++){
					if(a[j] == b[j])
						common++;
					else
						break;
				}
				if(common < max)
					max = common;
				i++;
			}
			
			for(int k = 0; k < max; k++){
				commonPrefix += strs[0].charAt(k);
			}
		}
		return commonPrefix;
    }
}