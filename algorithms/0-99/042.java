/*
Trapping Rain Water
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

For example, 
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
*/
public class Solution {
    public int trap(int[] A) {
    	if(A.length<2)
    		return 0;
    	int index = 0;
    	int curr = A[index];
    	int res = 0;
    	while(curr == 0)
    	{
            index++;
    		curr = A[index];
    	}
    	int currmax = curr;
    	int lastindex = index;
    	index++;    	    	
    	while(index <A.length)
    	{
    		curr = A[index];
    		if(curr >= currmax)
    		{
                 for(int i = lastindex;i<index;i++)
                 {
                	 res += currmax - A[i];
                 }
                 lastindex = index;
                 currmax = curr;
    		}    		
    		index++;
    	} 
    	index = index - 1;
    	int last = A[index];
    	index -= 1;
    	while(lastindex < index)
    	{
    		if(A[index] < last)
    		{
    			res += last-A[index];
    		}
    		else
    		{
    			last = A[index];
    		}
    		index--;
    	}
    	return res;   
    }
}

