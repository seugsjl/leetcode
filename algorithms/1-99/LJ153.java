/*

Find Minimum in Rotated Sorted Array
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
*/

public class Solution {
    public int findMin(int[] num) 
    {
        return find(num,0,num.length - 1);
    }
    public int find(int[] num,int l,int r)
    {
    	if(l == r)
    		return num[l];
    	if(num[l] < num[r])
    	{
    		return num[l];
    	}
    	else
    	{
    		int mid = (l + r)/2;
    		int lm = find(num,l,mid);
    		int rm = find(num,mid+1,r);
    		return Math.min(lm, rm);
    	}
    }
}
