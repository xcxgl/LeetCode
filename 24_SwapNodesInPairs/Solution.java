/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count = 0;
        ListNode temp0 = dummy;
        ListNode temp1 = dummy;
        ListNode temp2 = dummy;
        ListNode temp3 = dummy;
        while(head.next != null){
            count++;
            if(count % 2 == 1){
            	temp0 = temp1;
            	temp1 = head;
            	temp2 = head.next;
            	head = head.next;
            }
            else{
            	temp3 = head.next;
            	temp0.next = temp2;
            	temp2.next = temp1;
            	temp1.next = temp3;
            	head = temp3;
            }
        }
        if(count % 2 == 1){
        	temp0.next = temp2;
        	temp2.next = temp1;
        	temp1.next = null;
        }
        
        return dummy.next;
    }
}