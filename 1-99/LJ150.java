/*
Evaluate Reverse Polish Notation
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Some examples:
  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
*/
public class Solution {
    public int evalRPN(String[] tokens) {
        int i = 0;
        int a = 0;
        int b = 0;
        Stack<Integer> snum = new Stack<Integer>();
        while(i < tokens.length)
        {
            if(tokens[i].compareTo("+") == 0)
            {
        		b = snum.pop();
        		a = snum.pop();
        		snum.push(a+b);
            }
        	else if(tokens[i].compareTo("-") == 0)
        	{
        		b = snum.pop();
        		a = snum.pop();
        		snum.push(a-b);
        	}
        	else if(tokens[i].compareTo("*") == 0)
        	{
        		b = snum.pop();
        		a = snum.pop();
        		snum.push(a*b);
        	}
        	else if(tokens[i].compareTo("/") == 0)
        	{
        		b = snum.pop();
        		a = snum.pop();
        		snum.push(a/b);
        	}
        	else
        	{
        		snum.push(Integer.valueOf(tokens[i]));
        	}
            i++;
        }
        return snum.pop();        
    }
