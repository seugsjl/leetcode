/*
Gas Station 
There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

Note:
The solution is guaranteed to be unique.
*/
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	int allGas = 0;
    	int allCost = 0;
    	int cir = 0;
    	int i = 0;
    	int start = 0;
        while( cir < gas.length)
        {
        	allGas += gas[i%gas.length];
        	allCost += cost[i%gas.length];
        	if(allGas < allCost)
        	{
        		start = i+1;
        		cir = 0;
        		allGas = 0;
        		allCost = 0;
        	}
        	else
        	{
        		cir++;
        	}
        	i++;
        	if(i == 2*gas.length)
        		return -1;
        }
        return start;
    }
}
