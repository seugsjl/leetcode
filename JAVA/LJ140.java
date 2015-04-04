/*
Word Break II
Given a string s and a dictionary of words dict, add spaces in s to construct a sentence where each word is a valid dictionary word.

Return all such possible sentences.

For example, given
s = "catsanddog",
dict = ["cat", "cats", "and", "sand", "dog"].

A solution is ["cats and dog", "cat sand dog"].

*/
public class Solution {
    private int[][] resdp;
	private int size;
	String ss;
    public void DFS(int i,StringBuilder sb,List<String> l)
    {
    	for(int j = 0;j < i;j++)
    	{
			if(resdp[i][j] == 1)
			{
				sb.insert(0," ");
				sb.insert(0,(ss.substring(j, i)));
				if(j == 0)
				{
				   l.add(sb.toString());
				}
				else
				{
					DFS(j,sb,l);
				}
				sb.delete(0, i-j+1);
			}
    	}
    }
    public List<String> wordBreak(String s, Set<String> dict) {
          size =s.length();
        ss = s;
        List<String> l = new ArrayList<String>();
        boolean[] res = new boolean[size+1];
        resdp = new int[size+1][size+1];
        for(int i = 0;i<=size;i++)
        {
        	res[i] = false;
        	for(int w = 0; w <= size;w++)
        	{
        		resdp[i][w] = -1;
        	}
        }
        for (int i = 0;i <= size;i++)
        {
        	String sub = s.substring(0, i);
        	if(dict.contains(sub) == true)
        	{
        		res[i] = true;
        		resdp[i][0] = 1;
        		for(int j = 0;j < i;j++)
        		{
        			sub = s.substring(j, i);
        			if(res[j] == true && dict.contains(sub))
        			{
        				resdp[i][j] = 1;
        			}
        					
        		}
        	}
        	else
        	{
        		for(int j = 0;j < i;j++)
        		{
        			sub = s.substring(j, i);
        			if(res[j] == true && dict.contains(sub))
        			{
        				res[i] = true;
        				resdp[i][j] = 1;
        			}
        					
        		}
        	}
        }
        for(int i = 0;i <= size;i++)
        {
        	if(resdp[size][i] == 1)
        	{
        		StringBuilder sb = new StringBuilder();
        		sb.append(s.substring(i, size));
        		if(i != 0)
        		   DFS(i,sb,l);
        		else
        		  l.add(sb.toString());
        	}
        }
        return l;
    }
}
