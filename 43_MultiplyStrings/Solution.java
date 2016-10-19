import java.util.*;

public class Solution {
    public String multiply(String num1, String num2) {
        ArrayList<ArrayList<Integer>> mlt = new ArrayList<ArrayList<Integer>>();
        
        int carry = 0;//进位
        int rem = 0;//余数
        int index = 0;
        int j = 0;
    	for(int i = num1.length() - 1; i >= 0; i--){
    		ArrayList<Integer> res = new ArrayList<Integer>();
    		carry = 0;
    		for(j = num2.length() - 1; j >=0; j--){
    			rem = ((num1.charAt(i) - 48) * (num2.charAt(j) - 48) + carry) % 10;
    			res.add(rem);
    			carry = ((num1.charAt(i) - 48) * (num2.charAt(j) - 48) + carry) / 10;
    		}
    		if(carry != 0)
    			res.add(carry);
    		mlt.add(res);
    	}
    	//低位补0
    	for(int i = 1; i < mlt.size(); i++){
    		for(j = 0; j < i; j++){
    			mlt.get(i).add(j, 0);
    		}
    	}
    	//合并
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	carry = 0;
    	rem = 0;
    	for(int i = 0; i < mlt.get(mlt.size()-1).size(); i++){
    		rem = carry;
    		for(j = 0; j < mlt.size(); j++){
    			//rem += mlt.get(j).get(i);
    			rem += mlt.get(j).size()>i? mlt.get(j).get(i) : 0;
    		}
    		carry = rem / 10;
    		rem = rem % 10;
    		res.add(rem);
    	}
    	if(carry > 0)
    		res.add(carry);
    	//转换成string
    	StringBuilder mulRes = new StringBuilder();
    	if(res.get(res.size() - 1) == 0)
    		return "0";
    	for(int k = res.size() - 1; k >= 0 ; k--){
    		mulRes.append(res.get(k));
    	}
    	return mulRes.toString();
    }
    
    public static void main(String[] args){
    	System.out.println(new Solution().multiply("123456789", "987654321"));
    }
}