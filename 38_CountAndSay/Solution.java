public class Solution {
	public static String countAndSay(int n) {
        String sq = "1";
        for(int i = 2; i <= n; i++){
        	StringBuilder temp = new StringBuilder();
        	int length = sq.length();
        	char start = sq.charAt(0);
        	int point = 1;
        	int l = 0;
        	while(point <= length){
        		if(sq.charAt(point-1) == start){
        			l ++;
        			if(point == length){
        				//temp += l + "" + start;
        				temp.append(l).append(start);
        				break;
        			}
        		}
        		
        		else{
        			if(point == length){
        				//temp += l + "" + start + 1 + sq.charAt(point-1);
        				temp.append(l).append(start).append(1).append(sq.charAt(point-1));
        				break;
        			}
        			//temp += l + "" + start;
        			temp.append(l).append(start);
        			start = sq.charAt(point-1);
        			l = 1;
        		}
        		point ++;
        		
        	}
			
        	sq = temp.toString();
        }
        return sq;
    }
    public static void main(String[] args){
    	System.out.print(countAndSay(6));
    }
}