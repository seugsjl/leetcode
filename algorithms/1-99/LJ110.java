/*
Balanced Binary Tree
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
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
	boolean balanced = true;
	public int height(TreeNode root)
	{
		if(balanced == false)
		{
			return 0;
		}
		if(root == null)
		{
			return 0;
		}
		else
		{
			int lh = height(root.left);
			int rh = height(root.right);
			if(Math.abs(lh-rh) > 1)
			{
				balanced = false;
				return 0;
			}
			else
			{
				return lh > rh ? lh+1:rh+1;
			}
			
		}
			
	}
    public boolean isBalanced(TreeNode root) 
    {
    	balanced = true;
    	height(root);
    	return balanced;
    }
}
