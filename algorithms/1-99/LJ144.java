/*
Binary Tree Preorder Traversal 
Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].
*/
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
   public List<Integer> preorderTraversal(TreeNode root) 
    {
    	List<Integer> ls = new ArrayList<Integer>();
    	if(root == null)
    		return ls;
    	
    	Stack<TreeNode> ts = new Stack<TreeNode>();
    	TreeNode current = root;
    	//TreeNode output = null;
    	//ts.push(current);
    	
    	while(!ts.isEmpty() || current != null)
    	{
            while(current != null)
            {  
            	ls.add(current.val);  
                ts.push(current);  
                current = current.left;  
            }  
            current = ts.peek();  
  
            if(current.right != null )//|| (output == current.right && output != null))
            {  
            	ts.pop();
                current = current.right;
            	//ls.add(current.val);
                //ts.push(current);  
                //current = null;  
            }  
            else
            {  
            	ts.pop();
            	current = null;
            }  
    	}
    	
        return ls;         
    }
}
