public class Solution {
    public int romanToInt(String s) {
        int[] values = new int[s.length()];
		for(int i = 0; i < s.length(); i++){
			switch (s.charAt(i)){
			case 'I': values[i] = 1; break;
			case 'V': values[i] = 5; break;
			case 'X': values[i] = 10; break;
			case 'L': values[i] = 50; break;
			case 'C': values[i] = 100; break;
			case 'D': values[i] = 500; break;
			case 'M': values[i] = 1000; break;
			default: return -1;
			}
		}
		int result = values[s.length() - 1];
		for(int i = s.length() - 2; i >= 0; i--){
			if(values[i] < values[i + 1])
				result = result - values[i];
			else
				result = result + values[i];
		}
		return result;
    }
}