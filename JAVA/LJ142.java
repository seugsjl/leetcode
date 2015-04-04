/*
Linked List Cycle II 
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Follow up:
Can you solve it without using extra space?
*/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    	if(head == null)
    		return null;
    	ListNode s = head;
    	ListNode f = head;
        while(f != null)
        {
           if(f != null)
        	   f = f.next;
           if(f != null)
        	   f = f.next;
           if(s != null)
        	   s = s.next;
           if(f != null && f == s)
           {
               s = head;
               while(s != f)
               {
                   s = s.next;// -> next;
                   f = f.next;// -> next;
               }
               return s;
           }
                
    	}
        return null;          
    }
}
