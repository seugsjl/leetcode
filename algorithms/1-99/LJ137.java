/*
Single Number II 
Given an array of integers, every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
public class Solution {
    public int singleNumber(int[] A) {
        int[] bit = new int[32];
        int i = 0;
        int res = 0;
        while(i<A.length)
        {
        	for(int j = 0;j < 32;j++)
        	{
        	   bit[j] += (A[i]>>j)&1;
        	}
        	 
        	i++;
        }
        for(int w = 0; w< 32; w++)
        {
        	res|=(bit[w]%3)<<w;
        }
        return res;        
    }
}
