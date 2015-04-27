//Runtime:9ms
class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
   unsigned int x = 1;
   unsigned int res = 0;
   for(int i =0;i<32;i++)
   {
	  res = res <<1;
      if((n&x)>0)
      {
         res += 1; 
      }
      x = x <<1;
   }
   return res;   
    }
};
