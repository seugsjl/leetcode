/*
Valid Parentheses
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i =0;i<s.length();i++)
        {
        	char ch = s.charAt(i);
        	if(ch == '[' || ch == '{' || ch == '(')
        		st.push(ch);
        	else if(ch == ']' && !st.empty())
        	{
        		if(st.peek() == '[')
        			st.pop();
        		else
        			return false;
        	}
        	else if(ch == ')' && !st.empty())
        	{
        		if(st.peek() == '(')
        			st.pop();
        		else
        			return false;
        	}
        	else if(ch == '}' && !st.empty())
        	{
        		if(st.peek() == '{')
        			st.pop();
        		else
        			return false;
        	}
        	else
        		return false;
        	
        }
        if(st.isEmpty())
           return true;
        else
        	return false;  
    }
}
