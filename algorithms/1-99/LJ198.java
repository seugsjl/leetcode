class Solution 
{
    int l;
    int[] max;
    public int rob(int[] num) 
    {
        l = num.length;
        max = new int[l+1];
        max[0] = 0;
        if(l>0)
        {
            max[1] = num[0];
            for(int i = 2;i<=l;i++)
                max[i] = Math.max(max[i - 1], max[i - 2] + num[i - 1]);
            return max[l];
        }
        else
        {
        	return 0;
        }
    }
}
