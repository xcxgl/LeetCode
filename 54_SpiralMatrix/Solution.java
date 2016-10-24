
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix.length == 0)
        	return res;
        int cir = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;//row
        int j = 0;//column
        while(cir < n/2 + 1 && cir < m/2 + 1){
        	//left to right
        	if(j == n - cir)
        		break;
        	while(j < n - cir){
        		res.add(matrix[i][j++]);
        	}
        	j--;
        	
        	//top to bottom
        	i++;
        	if(i == m - cir)
        		break;
        	while(i < m - cir){
        		res.add(matrix[i++][j]);
        	}
        	i--;
        	//right to left
        	j--;
        	if(j == cir - 1)
        		break;
        	while(j > cir - 1){
        		res.add(matrix[i][j--]);
        	}
        	j++;
        	//bottom to top
        	i--;
        	if(i == cir)
        		break;
        	while(i > cir){
        		res.add(matrix[i--][j]);
        	}
        	i++;
        	j++;
        	cir++;
        }
        
        return res;
    }
}