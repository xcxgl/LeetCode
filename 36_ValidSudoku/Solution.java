public static boolean isValidSudoku(char[][] board) {
        int i = 0;
        int j = 0;
        int k = 0;
        int m = 0;
        int sum = 0;
        char[] nums = {'1','2','3','4','5','6','7','8','9','.'};
        
        //rows
        for(i = 0; i < 9; i++){
        	int[] flags = {0,0,0,0,0,0,0,0,0,0};
        	sum = 0;
            for(j = 0; j < 9; j++){
                for(k = 0; k < 10; k++){
                    if(board[i][j] == nums[k])
                        break;
                }
                if(k < 10)
                    flags[k]++;
            }
            for(k = 0; k < 9; k++){
                if(flags[k] >1)
                    return false;
                sum += flags[k];
            }
            if(sum + flags[9] < 9)
            	return false;
        }
        
        //columns
        for(i = 0; i < 9; i++){
        	int[] c_flags = {0,0,0,0,0,0,0,0,0,0};
        	sum = 0;
            for(j = 0; j < 9; j++){
                for(k = 0; k < 10; k++){
                    if(board[j][i] == nums[k])
                        break;
                }
                if(k < 10)
                	c_flags[k]++;
            }
            for(k = 0; k < 9; k++){
                if(c_flags[k] >1)
                    return false;
                sum += c_flags[k];
            }
            if(sum + c_flags[9] < 9)
            	return false;
        }
        //9 sub-boxes 
        for(i = 0; i < 9; i = i+3){
        	for(j = 0; j < 9; j = j+3){
        		if(check(i,j,board) == false)
        			return false;
        	}
        }
        return true;
    }
    public static boolean check(int r, int c, char[][] board){
    	 int i = 0;
    	 int j = 0;
    	 int k = 0;
    	 int sum = 0;
    	 char[] nums = {'1','2','3','4','5','6','7','8','9','.'};
    	 int[] flag = {0,0,0,0,0,0,0,0,0,0};
         for(i = r; i < r+3; i++){
             for(j = c; j < c+3; j++){
                 for(k = 0; k < 10; k++){
                     if(board[i][j] == nums[k]){
                         flag[k] ++;
                         break;
                     }
                 }
             }
         }
         for(k = 0; k < 9; k++){
             if(flag[k] >1)
                 return false;
             sum += flag[k];
         }
         if(sum + flag[9] < 9)
         	return false;
    	return true;
    }