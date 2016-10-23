
public class Solution {
    public double myPow(double x, int n) {
        if (x == 0.0 || x == 1.0) 
	        return x;
	    if (n == 0)
	        return 1.0;
	    else if (n < 0) {
	     // -MIN_VALUE = MAX_VALUE+1
	        if (n == Integer.MIN_VALUE)
	            return myPow(x, n+1)/x;
	        else 
	            return 1.0/myPow(x, -n);
	    }
	    else if(n == 1)
	    	return x;
	    else if (n % 2 == 0)
	    {
	    	double res = myPow(x, n/2);
	        return res*res;
	    }
	    else {
	    	double res = myPow(x, n/2);
	    	return x*res*res;
	    }
	}
}