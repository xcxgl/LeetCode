/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode dummy  = new ListNode(0);
       ListNode merge = dummy;
       while(l1 != null && l2 != null){
    	   if(l1.val >= l2.val){
    		   ListNode temp = new ListNode(l2.val);
    		   merge.next = temp;
    		   merge = merge.next;
    		   l2 = l2.next;
    	   }
    	   else{
    		   ListNode temp = new ListNode(l1.val);
    		   merge.next = temp;
    		   merge = merge.next;
    		   l1 = l1.next;
    	   }
       }
       if(l1 != null){
    	   merge.next = l1;
       }
       if(l2 != null){
    	   merge.next = l2;
       }
       return dummy.next;
    }
}