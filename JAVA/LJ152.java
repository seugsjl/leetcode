/*
  Maximum Product Subarray 
Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.
*/

public class Solution {
    public int maxProduct(int[] A) {
    	if(A.length == 0)
    	{
    		return 0;
    	}
        int min_temp = A[0];  
    	int max_temp = A[0];  
    	int result = A[0];;  
    	for(int i=1;i<A.length;i++)
    	{  
    	    int a = max_temp * A[i];  
    	    int b = min_temp * A[i];  
    	    int c = A[i];  
    	    max_temp = Math.max(Math.max(a, b), c);  
    	    min_temp = Math.min(Math.min(a, b), c);  
    	    result = max_temp>result? max_temp:result;  
    	}
    	return result;        
    }
}
