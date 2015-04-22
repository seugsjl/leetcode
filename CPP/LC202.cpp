#include<set>
using namespace std;

class Solution {
public:
int happy(int n)
{
	int res = 0;
    while( n > 0)
	{
		res += (n%10) * (n%10);
		n = n/10;
	}
	return res;
}
bool isHappy(int n) 
{
    set<int> s;
	//s.insert(n);
	set<int>::iterator it;
	while( n != 1)
	{
		it = s.find(n);
		if(it != s.end())
		{
			break;
		}
		s.insert(n);
		n = happy(n);
	}
	if(n == 1)
		return true;
	else
		return false;
}
};
