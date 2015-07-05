/*
Copy List with Random Pointer 
A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list.
*/
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) 
    {
        if(head == null)
        	return null;
        RandomListNode cu = head;
        while(cu != null)
        {
        	RandomListNode new1 = new RandomListNode(cu.label);
        	new1.next = cu.next;
        	cu.next = new1;
        	cu  = new1.next;
        }
        cu = head;
        RandomListNode newcu;
        while(cu != null)
        {
        	newcu = cu.next;
        	if(cu.random != null)
        	   newcu.random = cu.random.next;
        	else
        		newcu.random = null;
        	
        	cu = cu.next.next;
        }
        RandomListNode nh = head.next;
        cu = head;
        newcu = cu.next;
        while(cu != null)
        {
        	cu.next = newcu.next;
        	if(cu.next != null)
        	   newcu.next = cu.next.next;
        	cu = cu.next;
        	newcu = newcu.next;
        }
        return nh;
    }
}
