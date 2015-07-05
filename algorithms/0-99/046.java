/*
Permutations
Given a collection of numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
*/
public class Solution {
    public List<List<Integer>> lli = new ArrayList<List<Integer>>();
	public void DFS(boolean[] ans, int[] num,Stack<Integer> st) {
		
		for(int i =0;i<num.length;i++)
		{
			if(ans[i] == false)
			{
			    st.push(num[i]);
			    ans[i] = true;
			    if(st.size() == ans.length)
			    {
			    	List<Integer> cli = new ArrayList<Integer>();
			    	for(int k : st)
			    		cli.add(k);
			    	lli.add(cli);
			    }
			    else
			    {
			       DFS(ans,num,st);
			    }
			    ans[i] = false;
			    st.pop();
			    
			}
		}
	}

    public List<List<Integer>> permute(int[] num) 
    {
        boolean[] ans = new boolean[num.length];
        Stack<Integer> st = new Stack<Integer>();
        DFS(ans,num,st);
        return lli;
    }
}
