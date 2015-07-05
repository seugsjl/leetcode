/*

Majority Element 

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

class Solution {
public:
    int majorityElement(vector<int> &num) {
	int l = num.size();
	int count = 0; 
	int curr=0;//num.at(0);
	for(int i = 0;i< l;i++)
	{
		if(count == 0)
		{
			curr = num.at(i);
			count =1;
		}
		else
		{
			if(curr == num[i])
			{
				count++;
			}
			else
			{
				count--;
			}
		}

	}
	return curr;        
    }
};
