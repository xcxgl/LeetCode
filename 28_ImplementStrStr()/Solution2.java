public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length())
        	return -1;
        if(needle.length() == 0)
            return 0;
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
        	if(haystackArray[i] == needleArray[0]){
        		int j = 0;
        		for(j = 1; j < needle.length(); j++){
        			if(haystackArray[i + j] != needleArray[j])
        				break;
        		}
        		if(j == needle.length())
        			return i;
        	}
        }
		return -1;
    }
}