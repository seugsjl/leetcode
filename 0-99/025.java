/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = head;
        ListNode curr = head;
        ListNode nexts = head;
        ListNode temp = null;
        ListNode res = new ListNode(0);
        ListNode rescu = res;
        while(curr != null)
        {
        	int i = 0;
        	for(i = 0; i < k && curr != null;i++)
        	{
        		curr = curr.next;
        	}
        	if(i == k)
        	{
        		nexts = prev;
        		while(prev != curr)
        		{
        			temp = prev.next;
        			prev.next = rescu.next;
        		    rescu.next = prev;
        		    prev = temp;
        		}
        		rescu = nexts;
        	}
        	else
        	{
        		rescu.next = prev;
        	}
        }
        return res.next;     
    }
}