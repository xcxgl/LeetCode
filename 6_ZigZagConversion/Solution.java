public class Solution {
    public String convert(String s, int numRows) {
        String[] rows = new String[numRows];
		for(int k = 0; k < numRows; k++){
			rows[k] = "";
		}
		int i = 0;
		int j = 0;
		while(i < s.length()){
			//向下的竖列（包括两头）
			for(j = 0; j < numRows && i < s.length(); j++){
				rows[j] += s.charAt(i++);
			}
			//斜向上的线（不包括两头）
			for(j = numRows - 2; j > 0 && i < s.length(); j--){
				rows[j] += s.charAt(i++);
			}
		}
		String result = "";
		for(j = 0; j < numRows; j++){
			result += rows[j];
		}
		
		return result;
    }
}