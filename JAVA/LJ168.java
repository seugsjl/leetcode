/*
Excel Sheet Column Title 
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
*/
public class Solution {
    public String convertToTitle(int n) 
    {
        char[] res = new char[32];
        int i = 0;
        //n = n-1;
        while(n > 0)
        {
        	n--;
        	int tem = n%26;
        	res[i] = (char)( tem + 'A');
        	n = n/26;
        	i++;
        }
        StringBuffer sb = new StringBuffer();
        for(int j = i-1;j >= 0;j--)
        {
        	sb.append(res[j]);
        }
        return sb.toString();
    }
}
