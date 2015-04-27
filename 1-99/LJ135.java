/*
Candy
There are N children standing in a line. Each child is assigned a rating value.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?
*/
public class Solution {
    public int candy(int[] ratings) 
    {
    	 int length = ratings.length;
        int[] candy = new int[length];
        //for(int co = 0; co<length;co++)
        //	candy[co] = 1;
        int k = 1;
        for(int i = 1; i < length; i++)
        {
        	if(ratings[i] > ratings[i-1])
        	{
        		candy[i] = Math.max(k, candy[i]);
        		k++;
        	}
        	else
        	{
        		k = 1;
        	}
        }
        k = 1;
        for(int j = length - 2; j >= 0; j--)
        {
        	if(ratings[j] > ratings[j + 1]) //&& candy[j] == 1)
        	{
        		candy[j] = Math.max(k, candy[j]);
        		k++;
        	}
        	else
        		k = 1;
        	        	
        }
        int res = 0;
        for(int w : candy)
        	res += w;
        return res + length;
    }
}
