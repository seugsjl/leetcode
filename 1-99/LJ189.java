/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
*/
public class Solution {
    public void rotate(int[] nums, int k) {
    	  int l = nums.length;
    	  if(k>l)
    	  {
    		  k = k%l;
    	  }
          int[] res = new int[nums.length];          
          for(int i =0;i<l - k;i++)
          {
        	  res[i+k] = nums[i]; 
          }
          for(int i=0;i<k;i++)
          {
        	  res[i] = nums[i-k+l];
          }
          for(int i=0;i<l;i++)
          {
        	  nums[i] = res[i];
          }        
    }
}
