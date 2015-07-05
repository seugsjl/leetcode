/*
Insertion Sort List 
Sort a linked list using insertion sort.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
    	ListNode pre;
    	ListNode current;
    	ListNode nh = head;
    	if(head == null || head.next == null)
    		return head;
    	
    	current = head.next;
    	pre = head;
    	while(current != null)
    	{
    	   if(current.val >= pre.val)
    	   {
    		  current = current.next;
    		  pre = pre.next;
    	   }
    	   else
    	   {
    		   ListNode te1 = nh;
    		   if(te1.val > current.val)
    		   {
    			   nh = current;
    			   pre.next = current.next;
    			   current.next = te1;
    			   current = pre.next;
    		   }
    		   else
    		   {
    		       while(te1.next.val < current.val)
    		       {
    			       te1 = te1.next;
    		       }
    		       pre.next = current.next;
    		       current.next = te1.next;
    		       te1.next = current;
    		       current = pre.next;
    		   }
    	   }
    	   
    	}
        return nh;     
    }
}
