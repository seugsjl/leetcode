class Solution {
public:
    string convert(string s, int nRows) {
        if(nRows <= 1 || s.length() < 3 || s.length() <= nRows) return s;  
        string s2;  
        int zigSpan = nRows*2 - 2;  
        for (int i = 0; i < nRows; i++)  
        {  
            for (int j = i; j < s.length(); j+=zigSpan)  
            {  
                s2.push_back(s[j]);  
                //注意：推导出zigSpan+j-2i的数学公式，一点都不能错  
                if (i != 0 && i != nRows-1 && zigSpan+j-2*i<s.length())  
                {  
                    s2.push_back(s[zigSpan+j-2*i]);  
                }  
            }  
        }  
        return s2;  
    }
};