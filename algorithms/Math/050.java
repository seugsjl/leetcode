public class Solution {
    public double myPow(double x, int n) {
        if(n<0)
		{
			if(n==Integer.MIN_VALUE)
				return 1.0 / (myPow(x,Integer.MAX_VALUE)*x);
			else
				return 1.0 / myPow(x,-n);
		}
        if(n==0)
            return 1.0;
		double ans = 1.0 ;
		for(;n>0; x *= x, n>>=1)
		{
			if((n&1)>0)
				ans *= x;
		}
		return ans;
    }
}