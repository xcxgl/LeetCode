import java.util.*;

public class Solution {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
	    search(new ArrayList<Integer>(), candidates, 0, 0, target, list);
		return list;
    }
	public void search(List<Integer> myList, int[] cd, int start, int listSum, int tg, List<List<Integer>> list){
		if(listSum == tg && !list.contains(myList)){
			list.add(myList);
			return;
		}
		if(listSum > tg)
			return;
		for(int i = start; i < cd.length; i++){
			if(listSum + cd[i] <= tg){
				List<Integer> newList = new ArrayList<Integer>();
				newList.addAll(myList);
				newList.add(cd[i]);
				search(newList, cd, i + 1,listSum + cd[i], tg, list);
			}
		}
	}
	
    public static void main(String[] args){
    	int[] candidates = {10,1,2,7,6,1,5};
    	int target = 8;
    	List<List<Integer>> list = new Solution().combinationSum(candidates, target);
    	for(int i = 0; i < list.size(); i++){
    		for(int j = 0; j < list.get(i).size(); j++){
    			System.out.print(list.get(i).get(j) + " ");
    		}
    		System.out.println();
    	}
    }
}