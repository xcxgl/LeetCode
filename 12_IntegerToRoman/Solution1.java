public class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();
		map.put(1, "I");//1
		map.put(5, "V");//5
		map.put(2, "X");//10
		map.put(10, "L");//50
		map.put(3, "C");//100
		map.put(15, "D");//500
		map.put(4, "M");//1000
		
		String str = num + "";
		String result = "";
		int i = 0;
		while(i < str.length()){
			char c = str.charAt(i);
			switch (c){
				case '1': result += map.get(str.length() - i);
				break;
				case '2': result += map.get(str.length() - i) + map.get(str.length() - i);
				break;
				case '3': result += map.get(str.length() - i) + map.get(str.length() - i) 
									+ map.get(str.length() - i);
				break;
				case '4': result += map.get(str.length() - i) + map.get((str.length() - i) * 5);
				break;
				case '5': result += map.get((str.length() - i) * 5);
				break;
				case '6': result += map.get((str.length() - i) * 5) + map.get(str.length() - i);
				break;
				case '7': result += map.get((str.length() - i) * 5) + map.get(str.length() - i)
									+ map.get(str.length() - i);
				break;
				case '8': result += map.get((str.length() - i) * 5) + map.get(str.length() - i)
									+ map.get(str.length() - i) + map.get(str.length() - i);
				break;
				case '9': result += map.get(str.length() - i) + map.get(str.length() - i + 1);
				break;
				default: break;
			};
			i++;
		}
		
		return result;  
    }
}