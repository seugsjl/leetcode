//Runtime:17ms

class Solution {
public:
    int hammingWeight(uint32_t n) {
	 unsigned int w = 1;
	 int count = 0;
	 for(int i = 0;i<32;i++)
	 {
	 	  if((n&w) > 0)
	 	  {
	 	  	 count++;
	 	  }
	 	  w = w<<1;
	 }
	 return count;
    }
};
