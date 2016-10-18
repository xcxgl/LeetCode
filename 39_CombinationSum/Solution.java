import java.util.*;

public class Solution {
	List<List<Integer>> list = new ArrayList<List<Integer>>();
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        for(int i = 0; i < candidates.length; i++){
        	if(candidates[i] == target){
        		List<Integer> myList = new ArrayList<Integer>();
        		myList.add(candidates[i]);
        		list.add(myList);
        	}
        	if(candidates[i] < target){
	        	List<Integer> myList = new ArrayList<Integer>();
	        	myList.add(candidates[i]);
	        	search(myList, candidates, i, target);
        	}
        }
		
		return list;
    }
	public void search(List<Integer> myList, int[] cd, int start, int tg){
		int listSum = 0;
		for(int i = 0; i < myList.size(); i++){
			listSum += myList.get(i);
		}
		if(listSum == tg){
			list.add(myList);
			return;
		}
		if(listSum > tg)
			return;
		for(int i = start; i < cd.length; i++){
			List<Integer> newList = new ArrayList<Integer>();
			newList.addAll(myList);
			newList.add(cd[i]);
			search(newList, cd, i, tg);
		}
	}
	
	
    public static void main(String[] args){
    	int[] candidates = {2,3,6,7};
    	int target = 7;
    	List<List<Integer>> list = new Solution().combinationSum(candidates, target);
    	for(int i = 0; i < list.size(); i++){
    		for(int j = 0; j < list.get(i).size(); j++){
    			System.out.print(list.get(i).get(j) + " ");
    		}
    		System.out.println();
    	}
    }
}